
package student.controller;

import Database.DatabaseConnection;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import student.model.Student;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import student.model.InValidEmailException;
import student.model.InValidPhoneException;

public class DataStudentFunctionImp implements DataStudentFunction {
    
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    public DatabaseConnection dbcon = new DatabaseConnection();
    public MysqlDataSource data = dbcon.ketNoiSQL();
    
    public DataStudentFunctionImp(){};
    
    @Override
    public void readStudentSQL(ArrayList<Student> listst) {
        try ( Connection conn = data.getConnection() ) {
            String sql = "SELECT * FROM student";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String studentId = rs.getString(1);
                String nameS = rs.getString(2);
                String gender = rs.getString(3);
                String birthdayS = rs.getString(4);
                String classRoom = rs.getString(5);
                String address = rs.getString(6);
                String major = rs.getString(7);
                String phone = rs.getString(8);
                String mail = rs.getString(9);
                String password = rs.getString(10);
                
                Student st = new Student(studentId, classRoom, major, mail,
                       nameS, df.parse(birthdayS), address, phone, gender,password);
                listst.add(st);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
           ex.printStackTrace();
        }
    }
    
    @Override
    public int insertStudent(Student s) {
        try ( Connection conn = data.getConnection() ) {
            String sql = "INSERT INTO Student VALUES(?,?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getStudentId());
            ps.setString(2, s.getName());
            ps.setString(3, s.getGender());
            ps.setString(4, df.format(s.getDob()));
            ps.setString(5, s.getClassRoon());
            ps.setString(6, s.getAddress());
            ps.setString(7, s.getMajor());            
            ps.setString(8, s.getPhone());
            ps.setString(9, s.getEmail());
            ps.setString(10,s.getPassword());
            int row = ps.executeUpdate();
            return row;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    } 
    
    @Override  
    public int updateStudent(Student s) {
        try ( Connection conn = data.getConnection() ) {
            String sql = "UPDATE Student SET nameS = ? , gender = ?,"
                    + " birthdayS = ?, class = ? , address  = ?, marjor = ?,"
                    + " phone=?, mail=?, passwd=? WHERE studentId = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getName());
            ps.setString(2, s.getGender());
            ps.setString(3, df.format(s.getDob()));
            ps.setString(4, s.getClassRoon());
            ps.setString(5, s.getAddress());
            ps.setString(6, s.getMajor());            
            ps.setString(7, s.getPhone());
            ps.setString(8, s.getEmail());
            ps.setString(9,s.getPassword());
            ps.setString(10,s.getStudentId());
            int row = ps.executeUpdate();
            return row;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    
    @Override
    public int delStudent(Student s) {
        try ( Connection conn = data.getConnection() ) {
            String sql = "DELETE FROM student WHERE studentId = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, s.getStudentId());
            int row = ps.executeUpdate();
            return row;
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return -1;
    }
    
    @Override
    public Student getStudentByID(String studentID) {
        try ( Connection conn = data.getConnection() ) {
            String sql = "SELECT * FROM student WHERE studentId = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, studentID);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                Student s = new Student();
                s.setStudentId(rs.getString("studentId"));
                s.setName(rs.getString("nameS"));
                s.setGender(rs.getString("gender"));
                s.setDob(rs.getDate("birthdayS"));
                s.setAddress(rs.getString("address"));
                s.setClassRoon(rs.getString("class"));
                s.setAddress(rs.getString("address"));
                s.setMajor(rs.getString("marjor"));
                s.setPhone(rs.getString("phone"));
                s.setEmail(rs.getString("mail"));
                s.setPassword(rs.getString("passwd"));
                return s;
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        } catch (InValidEmailException | InValidPhoneException ex) {
            System.getLogger(DataStudentFunctionImp.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
        return null; // nếu không tìm thấy hoặc có lỗi
    }
    
    @Override
    public ArrayList<Student> searchByName (ArrayList<Student> listStudent, String nameStudent) 
    {
        ArrayList<Student> listSearch = new ArrayList<>();
         for ( Student e : listStudent) {
            String[] name = e.getName().split("\\s+");
            String firstName = name[name.length-1];
            if(firstName.equalsIgnoreCase(nameStudent)) {
                listSearch.add(e);
            } 
        }
         return listSearch;
    }
    
    @Override
    public ArrayList<Student> searchByClass (ArrayList<Student> listStudent, String clss) 
    {
        ArrayList<Student> listSearch = new ArrayList<>();
         for ( Student e : listStudent) {
            if(e.getClassRoon().equalsIgnoreCase(clss)) {
                listSearch.add(e);
            } 
        }
         return listSearch;
    }
    
    @Override
    public Student searchStudentById(ArrayList<Student> listStudent, String studentId) 
    {
        for ( Student e : listStudent) {
            if (e.getStudentId().equalsIgnoreCase(studentId)) {
                return e;
            }
        }
        return null;
    }   
    
}
