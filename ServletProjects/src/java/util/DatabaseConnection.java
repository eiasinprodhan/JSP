package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseConnection {
    private static Connection connection = null;
    private static final String url = "jdbc:mysql://localhost:3306/jsp";
    private static final String user = "root";
    private static final String password = "1234";
    private static final String driver = "com.mysql.cj.jdbc.Driver";
    
    public static Connection getConnection(){
        try {
            Class.forName(driver);
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(DatabaseConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return connection;
    }
}
