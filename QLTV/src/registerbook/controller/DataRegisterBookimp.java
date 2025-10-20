/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registerbook.controller;

import book.Controller.DataFuctionImplement;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
//import java.sql.Date;
import java.sql.SQLException;
import java.util.ArrayList;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import registerbook.model.RegisterBook;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//import javax.swing.JOptionPane;

/**
 *
 * @author DELL
 */
public class DataRegisterBookimp implements DataRegisterBookFuction {

    @Override
    public void readRegisterBookSQL(ArrayList<RegisterBook> listRb) {
        DataFuctionImplement data = new DataFuctionImplement();
        MysqlDataSource ds = data.ketNoiSQL();
        try {
            Connection cn = ds.getConnection();
            String sql = "SELECT * FROM registerbook";
            PreparedStatement ps = cn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String studentId = rs.getString(1);
                String bookId = rs.getString(2);
                int amount = rs.getInt(3);
                String borrowDate = rs.getString(4);
                String appointDate = rs.getString(5);
                String payDate = rs.getString(6);
                String giveBookBack = rs.getString(7);
                RegisterBook rb = new RegisterBook(studentId, bookId, amount, borrowDate,
                        appointDate, payDate, giveBookBack);
                listRb.add(rb);

            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    @Override
    public int writeRegisterBookSQL(RegisterBook rb) {
        DataFuctionImplement df = new DataFuctionImplement();
        MysqlDataSource ds = df.ketNoiSQL();
        try {
            Connection cn = ds.getConnection();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            SimpleDateFormat sdfappoint = new SimpleDateFormat("dd/MM/yyyy");
            String sql = "INSERT INTO registerbook VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, rb.getStudentId());
            ps.setString(2, rb.getBookId());
            ps.setInt(3, rb.getAmountBook());
            ps.setString(4, sdf.format(rb.getBorrowDate()));
            ps.setString(5, sdfappoint.format(rb.getAppointDate()));
            ps.setString(6, "");
            ps.setString(7, rb.getGiveBookBack());
            return ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        } 
        return -1;

    }

    @Override
    public int updateRegisterBookSQL(RegisterBook rb, String bookId, String studentId) {
        DataFuctionImplement df = new DataFuctionImplement();
        MysqlDataSource ds = df.ketNoiSQL();
        try { 
            Connection cn = ds.getConnection();
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            SimpleDateFormat sdfappoint = new SimpleDateFormat("dd/MM/yyyy");
            String sql = "Update registerbook SET studentID = ?, bookID = ? , amount = ?,"
                    + "borrowDate = ?, appointDate = ? , payDate = ? , "
                    + "giveBookBack = ? WHERE studentID = ? AND bookID = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, rb.getStudentId());
            ps.setString(2, rb.getBookId());
            ps.setInt(3, rb.getAmountBook());
            ps.setString(4, sdf.format(rb.getBorrowDate()));
            ps.setString(5, sdfappoint.format(rb.getAppointDate()));
            if (rb.getPayDate() != null) {
                ps.setString(6, sdf.format(rb.getPayDate()));
            } else {
                ps.setString(6, "");
            }
            ps.setString(7, rb.getGiveBookBack());
            ps.setString(8, studentId);
            ps.setString(9, bookId);
            return ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    @Override
    public ArrayList<RegisterBook> seachByStudentId(ArrayList<RegisterBook> listRb, String studentId) {
        ArrayList<RegisterBook> listSeachRB = new ArrayList<>();
        if (!listRb.isEmpty()) {
            for (RegisterBook e : listRb) {
                if (e.getStudentId().equalsIgnoreCase(studentId)) {
                    listSeachRB.add(e);

                }

            }

        } else {
            System.out.println("danh sách rỗng");

        }
        return listSeachRB;

    }

    @Override
    public ArrayList<RegisterBook> seachByBookId(ArrayList<RegisterBook> listRb, String bookId) {
        ArrayList<RegisterBook> listSeachRB = new ArrayList<>();
        if (!listRb.isEmpty()) {
            for (RegisterBook e : listRb) {
                if (e.getBookId().equalsIgnoreCase(bookId)) {
                    listSeachRB.add(e);

                }

            }

        } else {
            System.out.println("danh sách rỗng");

        }
        return listSeachRB;

    }

    @Override
    public ArrayList<RegisterBook> seachByGiveBookBack(ArrayList<RegisterBook> listRb, String gvb) {
        ArrayList<RegisterBook> listSeachRB = new ArrayList<>();
        if (!listRb.isEmpty()) {
            for (RegisterBook e : listRb) {
                if (e.getGiveBookBack().equalsIgnoreCase(gvb)) {
                    listSeachRB.add(e);
                }
            }

        } else {
            System.out.println("danh sách rỗng");

        }
        return listSeachRB;
    }

    @Override
    public int deleteRegisterBookSQL(RegisterBook rb) {
        DataFuctionImplement dataFuctionImplement = new DataFuctionImplement();

        MysqlDataSource ds = dataFuctionImplement.ketNoiSQL();
        try {
            Connection cn = ds.getConnection();
            String sql = "DELETE FROM registerbook WHERE studentID = ? AND bookID = ?";
            PreparedStatement ps = cn.prepareStatement(sql);
            ps.setString(1, rb.getStudentId());
            ps.setString(2, rb.getBookId());
            return ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;

    }
}
