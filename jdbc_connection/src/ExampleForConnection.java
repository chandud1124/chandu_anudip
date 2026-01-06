import java.sql.*;

public class ExampleForConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/anpd3911";
        String user = "root";
        String password = "";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database successfully!");
            conn.close();
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL Driver not found!");
            e.printStackTrace();
        } catch (SQLException e) {
            System.out.println("Connection failed!");
            e.printStackTrace();
        }
    }
}
