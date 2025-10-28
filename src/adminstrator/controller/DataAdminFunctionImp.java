
package adminstrator.controller;

import Database.DatabaseConnection;
import adminstrator.model.Employee;
import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import registerbook.model.RegisterBook;

public class DataAdminFunctionImp implements DataAdminFunction {

    private final SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
    private final  DatabaseConnection dbcon = new DatabaseConnection();
    private final  MysqlDataSource data = dbcon.ketNoiSQL();
    
    public DataAdminFunctionImp(){};
    
    @Override
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
        } catch (SQLException | ParseException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
        }
        
    }

    @Override
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
    
    @Override
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
    
    @Override
    public Employee existAccountAdminSQL(String tk, String mk) {
        try ( Connection conn = data.getConnection() ) {
            String sql = "SELECT * FROM employee WHERE tk = ? AND passwd = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tk);
            ps.setString(2, mk);
            ResultSet rs = ps.executeQuery();
            if(rs.next()) {
                String tkk = rs.getString(1);
                String passwd = rs.getString(2);
                String name = rs.getString(3);
                String gender = rs.getString(4);
                SimpleDateFormat sdfappoint = new SimpleDateFormat("dd/MM/yyyy");
                Date date1 = df.parse(rs.getString(5));
                String date = sdfappoint.format(date1);
                String address = rs.getString(6);
                String phone = rs.getString(7);
                Employee emp = new Employee(tkk, passwd, name, sdfappoint.parse(date), address, phone, gender);
                return emp;
            }
        } catch (SQLException | ParseException ex) {
            ex.printStackTrace();
        }
        return null;
    }
    
    @Override
    public boolean checkExistTKAdminSQL(String tk) {
        try ( Connection conn = data.getConnection() ) {
            String sql = "SELECT * FROM employee WHERE tk = ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, tk);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return false;
    }
    
    @Override
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
