import java.sql.*;

public class ExampleForStatement {

    public static void main(String[] args) {

        String jdbcurl = "jdbc:mysql://localhost:3306/anpd3911";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection c = DriverManager.getConnection(jdbcurl, username, password);

            // create a statement object

            Statement s = c.createStatement();
            // Creating a new table
            String createTable = "CREATE TABLE IF NOT EXISTS users(id INT PRIMARY key, name VARCHAR(255))";
            s.execute(createTable);
            System.out.println("✅ Table created successfully");

            // Insert data into the table
            String insertData = "Insert into users(id, name) VALUES(1, 'Madhu'),(2, 'Vamsi'),(3, 'Iram')";
            int rowsAffected = s.executeUpdate(insertData);
            System.out.println("✅ " + rowsAffected + " rows added successfully");

            // Retrieve data from the table
            String selectData = "SELECT * FROM users";
            ResultSet rs = s.executeQuery(selectData);

            System.out.println("\n📋 User Data:");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                System.out.println("ID: " + id + ", Name: " + name);
            }

            rs.close();
            s.close();
            c.close();
            System.out.println("\n✅ All operations completed successfully!");
        } catch (SQLException e) {
            System.out.println("SQL Error: " + e.getMessage());
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("Driver not found!");
            e.printStackTrace();
        }

    }

}
