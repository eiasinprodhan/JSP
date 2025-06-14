package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Student;
import util.DatabaseConnection;

public class StudentDao {

    static Connection dc = DatabaseConnection.getConnection();
    static PreparedStatement ps;
    static ResultSet rs;
    static String sql;

    public static List<Student> getStudents() {
        List<Student> students = new ArrayList<>();
        sql = "select * from student";
        try {
            ps = dc.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                Student student = new Student(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone")
                );

                students.add(student);
            }
        } catch (SQLException ex) {
            Logger.getLogger(StudentDao.class.getName()).log(Level.SEVERE, null, ex);
        }

        return students;
    }

}
