import java.sql.*;

// Singleton Design Pattern
public class DBUtils {
	private static Connection con = null;
	static String url = "jdbc:mysql://localhost/college";
	
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			System.out.println("Driver class not found...");
		}
	}
	
	public static Connection getDbConnection() {
		if (con == null) {
			try {
				con = DriverManager.getConnection(url, "root", "root");
			}catch(SQLException e) {
				System.out.println("connection failed...");
			}
		}
		return con;
	}

	public static void closeConnection() {
		try {
			if (con!=null) {
				con.close();
			}
		}catch(SQLException e) {
			System.out.println("connection closing failed...");
		}

	}
}
