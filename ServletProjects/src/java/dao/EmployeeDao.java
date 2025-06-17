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

    //Get All Employees Details From Database
    public static List<Employee> getAllEmployees() {
        List<Employee> employees = new ArrayList<>();
        sql = "select * from employee";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String gender = rs.getString("gender");
                String designation = rs.getString("designation");
                float salary = rs.getFloat("salary");
                Employee employee = new Employee(id, name, email, phone, gender, designation, salary);
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

    //Set Employee Details To Database
    public static int setEmployee(Employee employee) {
        int status = 0;
        sql = "insert into employee(name, email, phone, gender, designation, salary)values(?,?,?,?,?,?)";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getEmail());
            ps.setString(3, employee.getPhone());
            ps.setString(4, employee.getGender());
            ps.setString(5, employee.getDesignation());
            ps.setFloat(6, employee.getSalary());
            status = ps.executeUpdate();
            ps.close();
            DatabaseConnection.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }

    //Get Employee Details By Id
    public static Employee getEmployeeByID(int id) {
        Employee employee = new Employee();
        sql = "select * from employee where id = ?";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id1 = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String phone = rs.getString("phone");
                String gender = rs.getString("gender");
                String designation = rs.getString("designation");
                float salary = rs.getFloat("salary");
                employee = new Employee(id1, name, email, phone, gender, designation, salary);
            }
            rs.close();
            ps.close();
            DatabaseConnection.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return employee;
    }

    //Update Employee Details
    public static int updateEmployee(Employee employee) {
        int status = 0;
        sql = "update employee set name = ?, email = ?, phone = ?, gender = ?, designation = ?, salary = ? where id = ?";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setString(1, employee.getName());
            ps.setString(2, employee.getEmail());
            ps.setString(3, employee.getPhone());
            ps.setString(4, employee.getGender());
            ps.setString(5, employee.getDesignation());
            ps.setFloat(6, employee.getSalary());
            ps.setInt(7, employee.getId());
            status = ps.executeUpdate();
            ps.close();
            DatabaseConnection.getConnection().close();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
    //Delete Employee From Database
    public static int deleteEmployee(int id){
        int status = 0;
        sql = "delete from employee where id = ?";
        try {
            ps = DatabaseConnection.getConnection().prepareStatement(sql);
            ps.setInt(1, id);
            status = ps.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(EmployeeDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
    
    //Search Employee From Database By Id Or Name
    public static List<Employee> searchEmployees(String keyword) {
        List<Employee> employees = new ArrayList<>();
        sql = "select * from employee where id like ? or name like ?";
        try {
            ps = DatabaseConnection.getConnection().prepareCall(sql);

            for (int i = 1; i <= 2; i++) {
                ps.setString(i, "%" + keyword + "%");
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
