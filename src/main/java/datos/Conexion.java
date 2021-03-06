package datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jesus
 */
public class Conexion {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/zerodistance?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "";
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
    }
    
    public static void close(ResultSet resultSet) throws SQLException{
        resultSet.close();
    }
    
    public static void close(PreparedStatement preparedStatement) throws SQLException{
        preparedStatement.close();
    }
    
    public static void close(Connection connection) throws SQLException{
        connection.close();
    }
}
