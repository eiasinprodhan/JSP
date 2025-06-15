package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;
import util.DatabaseConnection;

public class StudentDao {
    static Student student = new Student();
    static DatabaseConnection dc = new DatabaseConnection();
    static String sql;
    static PreparedStatement ps;
    
    public static int saveStudent(Student student){
        int status = 0;
        
        sql = "insert into studentdetails(name,email,fee)values(?,?,?)";
        try {
            ps = dc.getConnection().prepareCall(sql);
            ps.setString(1, student.getName());
            ps.setString(2, student.getEmail());
            ps.setFloat(3, student.getFee());
            status = ps.executeUpdate();
            System.out.println(status);
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return status;
    }
}
