import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ExampleForPreparedStatement {

	public static void main(String[] args) throws ClassNotFoundException {
		
		String jdbcurl = "jdbc:mysql://localhost:3306/anpd3911";
		String username = "root";
		String password = "";
		
		int userId = 5;
		String userName = "Rajesh";
		
		String insertData = "INSERT INTO users(id, name) VALUES(?, ?)";
		
		Connection c = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			c = DriverManager.getConnection(jdbcurl, username, password);
			PreparedStatement ps = c.prepareStatement(insertData);
			ps.setInt(1, userId);
			ps.setString(2, userName);
			
			int rowsAffected = ps.executeUpdate();
			
			if(rowsAffected > 0)
			{
				System.out.println("Record inserted successfully");
			}
			else
			{
				System.out.println("Failed to insert record");
			}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally {
			try {
				if(c != null) {
					c.close();
				}
			}
			catch(SQLException e)
			{
				e.printStackTrace();
			}
		}
		
	}

}
