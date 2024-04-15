package src.main.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public interface PreparedStatement extends Statement {
    void setInt(int parameterIndex, int x) throws SQLException;
    void setString(int parameterIndex, String x) throws SQLException;

    ResultSet executeQuery() throws SQLException;
    int executeUpdate() throws SQLException;

}
