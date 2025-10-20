/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package book.Controller;

import book.Model.Book;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DELL
 */
public class DataFuctionImplement implements DataFuction {

    @Override
    public MysqlDataSource ketNoiSQL() {
        MysqlDataSource data = new MysqlDataSource();
        data.setUser(DataFuction.USER_NAME);
        data.setPassword(DataFuction.PASSWD);
        data.setDatabaseName(DataFuction.DB_NAME);
        data.setPortNumber(DataFuction.PORT);
        data.setServerName(DataFuction.SERVER_NAME);

        return data;
    }

    @Override
    public void readBookSQL(ArrayList<Book> listBook) {
        MysqlDataSource data = ketNoiSQL();
        try {
            Connection conn = data.getConnection();
            String sql = "SELECT * FROM book";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String bookId = resultSet.getString(1);
                String nameb = resultSet.getString(2);
                String category = resultSet.getString(3);
                String author = resultSet.getString(4);
                String producer = resultSet.getString(5);
                String price = resultSet.getString(6);
                int count = resultSet.getInt(7);
                Book b = new Book(bookId, nameb, category, author, producer, price, count);
                listBook.add(b);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (InValidPriceException ex) {
            ex.printStackTrace();
        } catch (InValidAuthorException ex) {
           ex.printStackTrace();
        }
    }

    @Override
    public int writeBookSQL(Book b) {
        MysqlDataSource data = ketNoiSQL();
        try {
            Connection conn = data.getConnection();
            String sql = "INSERT INTO BOOK VALUES(?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, b.getBookId());
            ps.setString(2, b.getName());
            ps.setString(3, b.getCategory());
            ps.setString(4, b.getAuthor());
            ps.setString(5, b.getProducer());
            ps.setFloat(6, b.getPrice());
            ps.setInt(7, b.getAmount());
            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    @Override
    public int updateBookSQL(Book b) {
        MysqlDataSource data = ketNoiSQL();
        try {
            Connection conn = data.getConnection();
            String sql = "UPDATE book SET nameB = ? , category = ?,"
                    + " author = ?, producer = ? , price  = ?, count = ? WHERE bookID = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, b.getName());
            ps.setString(2, b.getCategory());
            ps.setString(3, b.getAuthor());
            ps.setString(4, b.getProducer());
            ps.setFloat(5, b.getPrice());
            ps.setInt(6, b.getAmount());
            ps.setString(7, b.getBookId());
            ps.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;

    }

    @Override
    public int delBookSQL(Book b) {
        MysqlDataSource data = ketNoiSQL();
        try { 
            Connection conn = data.getConnection();
            String sql = "DELETE FROM book WHERE bookId = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, b.getBookId());
            ps.executeUpdate();
        }catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }

    @Override
    public ArrayList<Book> seachByNameBook(ArrayList<Book> listBook, String bookName) {

        ArrayList<Book> listseach = new ArrayList<>();
        String regex = "^.*" + bookName + ".*$";
        Pattern p = Pattern.compile(regex,Pattern.CASE_INSENSITIVE);
        for (Book e : listBook) {
            Matcher m = p.matcher(e.getName());
            if (m.matches()) {
                listseach.add(e);
            }
        }
        return listseach;

    }

    @Override
    public ArrayList<Book> seachByAuthor(ArrayList<Book> listBook, String authorName) {
        ArrayList<Book> listseach = new ArrayList<>();
        for (Book e : listBook) {
            String[] fullname = e.getAuthor().split("\\s+");
            String firstName = fullname[fullname.length-1];
            if (firstName.equalsIgnoreCase(authorName)) {
                listseach.add(e);
            }
        }
        return listseach;
    }

    @Override
    public Book seachBookId(ArrayList<Book> listBook, String bookid) {
        for (Book e : listBook) {
            if (e.getBookId().equalsIgnoreCase(bookid)) {
                return e;
            }
        }
        return null;

    }

}
