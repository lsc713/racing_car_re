package src.main.jdbc;

import java.sql.Connection;
import java.sql.SQLException;

public class DriverManager {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        return java.sql.DriverManager.getConnection(
                "jdbc:mysql:address:port/dbname", "username", "password"
        );
    }

}
