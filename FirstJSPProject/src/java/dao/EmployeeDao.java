package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Employee;
import util.DatabaseConnection;

public class EmployeeDao {

    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        sql = "select * from employee";
        try {
            ps = DatabaseConnection.getConnection().prepareCall(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("gender"),
                        rs.getString("designation"),
                        rs.getFloat("salary")
                );

                employees.add(employee);
            }
            rs.close();
            ps.close();
            DatabaseConnection.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return employees;
    }

    public static int saveEmployee(Employee e) {
        int status = 0;
        sql = "insert into employee(name,email,phone,gender,designation,salary)values(?,?,?,?,?,?)";
        try {
            ps = DatabaseConnection.getConnection().prepareCall(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getEmail());
            ps.setString(3, e.getPhone());
            ps.setString(4, e.getGender());
            ps.setString(5, e.getDesignation());
            ps.setFloat(6, e.getSalary());
            status = ps.executeUpdate();
            ps.close();
            DatabaseConnection.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return status;
    }

    public static void deleteEmployee(int id) {
        sql = "delete from employee where id = ?";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            DatabaseConnection.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Employee getEmployeeById(int id) {
        Employee employee = null;

        sql = "select * from employee where id = ?";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                employee = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("gender"),
                        rs.getString("designation"),
                        rs.getFloat("salary")
                );
            }
            rs.close();
            ps.close();
            DatabaseConnection.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employee;
    }
    
    public static int updateEmployee(Employee e){
        int status = 0;
        
        sql = "update employee set name = ?, email = ?, phone = ?, gender = ?, designation = ?, salary = ? where id = ?";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setString(1, e.getName());
            ps.setString(2, e.getEmail());
            ps.setString(3, e.getPhone());
            ps.setString(4, e.getGender());
            ps.setString(5, e.getDesignation());
            ps.setFloat(6, e.getSalary());
            ps.setInt(7, e.getId());
            status = ps.executeUpdate();
            ps.close();
            DatabaseConnection.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
    public static List<Employee> searchEmployeesByName(String name) {
        List<Employee> employees = new ArrayList<>();
        sql = "select * from employee where id like ? or name like ?";
        try {
            ps = DatabaseConnection.getConnection().prepareCall(sql);
            
            for(int i=1; i<=2; i++){
                ps.setString(i, "%" + name + "%");
            }
            
            rs = ps.executeQuery();
            while (rs.next()) {
                Employee employee = new Employee(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone"),
                        rs.getString("gender"),
                        rs.getString("designation"),
                        rs.getFloat("salary")
                );

                employees.add(employee);
            }
            rs.close();
            ps.close();
            DatabaseConnection.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return employees;
    }
}
