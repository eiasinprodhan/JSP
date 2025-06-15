package dao;

import java.sql.Connection;
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
}
