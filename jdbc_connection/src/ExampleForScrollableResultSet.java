import java.sql.*;

public class ExampleForScrollableResultSet {

    public static void main(String[] args) {

        String jdbcurl = "jdbc:mysql://localhost:3306/anpd3911";
        String username = "root";
        String password = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection c = DriverManager.getConnection(jdbcurl, username, password);
            Statement s = c.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);

            String selectData = "SELECT StudentID, FirstName, LastName FROM Student";
            ResultSet resultSet = s.executeQuery(selectData);

            System.out.println("📋 Demonstrating Scrollable ResultSet:");
            System.out.println("=====================================\n");

            // move the cursor to the last row
            resultSet.last();
            // retrieve the data from the last row
            String lastID = resultSet.getString("StudentID");
            String fname = resultSet.getString("FirstName");
            String lname = resultSet.getString("LastName");
            System.out.println("🔽 Last Student ID : " + lastID + ", Name : " + fname + " " + lname);

            // move the cursor to the first row
            resultSet.first();
            // retrieve the data from the first row
            String FirstID = resultSet.getString("StudentID");
            fname = resultSet.getString("FirstName");
            lname = resultSet.getString("LastName");
            System.out.println("🔼 First Student ID : " + FirstID + ", Name : " + fname + " " + lname);

            // move the cursor to the absolute row
            resultSet.absolute(3);
            // retrieve the data from the absolute row
            String absoluteID = resultSet.getString("StudentID");
            fname = resultSet.getString("FirstName");
            lname = resultSet.getString("LastName");
            System.out.println("📍 Absolute(3) Student ID : " + absoluteID + ", Name : " + fname + " " + lname);

            System.out.println("\n✅ Scrollable ResultSet operations completed!");

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
