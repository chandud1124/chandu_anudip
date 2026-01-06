import java.sql.*;

public class ExampleOfResultset {

    public static void main(String[] args) {

        String jdbcurl = "jdbc:mysql://localhost:3306/anpd3911";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection(jdbcurl, username, password);
            Statement s = c.createStatement();

            String select_Data = "SELECT id, name from users";
            ResultSet resultSet = s.executeQuery(select_Data);

            // Iterating over the resultset.
            System.out.println("📋 Fetching data from users table:");
            System.out.println("------------------------------------");

            while (resultSet.next()) {
                String id = resultSet.getString("id");
                String name = resultSet.getString("name");

                System.out.println("ID : " + id + ", Name : " + name);
            }

            System.out.println("------------------------------------");
            System.out.println("✅ ResultSet iteration completed!");

            resultSet.close();
            s.close();
            c.close();
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found!");
            e.printStackTrace();
        }

    }

}
