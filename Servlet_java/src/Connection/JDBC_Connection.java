package Connection;

import java.sql.*;


public class JDBC_Connection {
	public static Connection getConnection() {
		String url = "jdbc:mysql://localhost:3306/bhargav";
		String user = "root";
		String password = "Bhargav@123";
		Connection con = null;
		try {
			con = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return con;
	}
}
