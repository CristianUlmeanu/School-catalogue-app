package Services;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnectionSingleton {
    private static Connection con;
    private DbConnectionSingleton() {};
    private static void Initiere()
    {
        String url = "jdbc:mysql://localhost:3306/sys";
        String user = "root";
        String pass = "123456789";
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
        }
        catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public static Connection getConnection()
    {
        Initiere();
        return con;
    }
}
