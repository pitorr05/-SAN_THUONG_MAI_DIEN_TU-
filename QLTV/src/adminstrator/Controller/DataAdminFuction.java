/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adminstrator.Controller;

import Database.databaseConnection;
import adminstrator.model.Employee;
import book.Controller.DataFuctionImplement;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import registerbook.model.RegisterBook;

/**
 *
 * @author DELL
 */
public class DataAdminFuction {

    private final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    private final  databaseConnection dbcon = new databaseConnection();
    private final  MysqlDataSource data = dbcon.ketNoiSQL();
    
    public DataAdminFuction(){};
    
    public void readListAdmin(ArrayList<Employee> listE) {
        try ( Connection conn = data.getConnection() ) {
            String sql = "SELECT * FROM employee";
            PreparedStatement per = conn.prepareStatement(sql);
            ResultSet rs = per.executeQuery();
            while (rs.next()) {
                String tk = rs.getString(1);
                String passwd = rs.getString(2);
                String name = rs.getString(3);
                String gender = rs.getString(4);
                String date = rs.getString(5);
                String address = rs.getString(6);
                String phone = rs.getString(7);
                Employee e = new Employee(tk, passwd, name, df.parse(date), address, phone, gender);
                listE.add(e);

            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();  // lỗi parse ngày
        }
    }

    public int updateAdmin(Employee emp) {
        try ( Connection conn = data.getConnection() ) {
            String sql = "UPDATE employee SET passwd = ? WHERE tk = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, emp.getPassword());
            ps.setString(2, emp.getNameTK());
            return ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;

    }
    
    public int writeRegisterBookSQL(RegisterBook rb) {
        try ( Connection conn = data.getConnection() ) {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            SimpleDateFormat sdfappoint = new SimpleDateFormat("dd/MM/yyyy");
            String sql = "INSERT INTO registerbook VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
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
    
    public boolean checkExistAccountAdminSQL(String tk) {
        try ( Connection conn = data.getConnection() ) {
            String sql = "SELECT * FROM employee WHERE tk = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tk);

            ResultSet rs = ps.executeQuery();

            // Nếu có dòng dữ liệu => tài khoản tồn tại
            return rs.next();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }
    
    public void writeRegisterAdminSQL(Employee newEmployee) {
        try ( Connection conn = data.getConnection() ) {
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            String sql = "INSERT INTO employee VALUES (?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, newEmployee.getNameTK());
            ps.setString(2, newEmployee.getPassword());
            ps.setString(3, newEmployee.getName());
            ps.setString(4, newEmployee.getGender());
            ps.setString(5, sdf.format(newEmployee.getDob()));
            ps.setString(6, newEmployee.getAddress());
            ps.setString(7, newEmployee.getPhone());
            ps.executeUpdate();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

}
