package m5.activity2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class DBConnection {

	private static final String URL = "jdbc:postgresql://localhost:5432/training_db";
	private static final String USER = "postgres";
	private static final String PASSWORD = "postgres";
	
	public static void main(String[] args) {
		Connection conn = null;
		ResultSet rs = null;
		Statement stmt = null;
	try {
		conn = DriverManager.getConnection(URL, USER, PASSWORD);
		System.out.println("Connected to PostgreSQL successfully.");
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		}
	}

}

