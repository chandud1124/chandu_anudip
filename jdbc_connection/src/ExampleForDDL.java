import java.sql.*;

public class ExampleForDDL {

    public static void main(String[] args) {

        String jdbcurl = "jdbc:mysql://localhost:3306/anpd3911";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection(jdbcurl, username, password);
            Statement s = c.createStatement();

            System.out.println("📋 DDL Operations Demo:");
            System.out.println("=======================\n");

            // CREATE TABLE
            String createTable = "CREATE TABLE user(id INT primary key, name VARCHAR(255))";
            s.execute(createTable);
            System.out.println("✅ CREATE: Table 'user' created successfully!");

            // ALTER TABLE
            String alterTable = "ALTER TABLE user ADD COLUMN email varchar(255)";
            s.execute(alterTable);
            System.out.println("✅ ALTER: Column 'email' added to table!");

            // DROP TABLE
            String dropTable = "DROP TABLE user";
            s.execute(dropTable);
            System.out.println("✅ DROP: Table 'user' dropped successfully!");

            System.out.println("\n🎯 All DDL operations completed successfully!");

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
