package manohar;

import java.sql.*;

import com.mysql.cj.protocol.Resultset;

public class JDBCTestconnection {

	public static void main(String[] args) {
		Statement st = null;
		Connection con = null;
		PreparedStatement pre = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bhargav", "root", "Bhargav@123");
			con.setAutoCommit(false);
			st=con.createStatement();
			
			pre=con.prepareStatement("insert into sample(cust_name,cust_qual,nickname) values(?,?,?)");
			
			pre.setString(1,"ano");
			pre.setString(2,"btech");
			pre.setString(3, "cse");
			
			int a=pre.executeUpdate();
			
			con.commit();
			
			if(a>0){
				System.out.println("updated");
				ResultSet rs=st.executeQuery("select * from sample");
				while(rs.next()){
					System.out.println(rs.getString(2)+"  " + rs.getString(3) + "  " +rs.getString(4));
				}
			}
			else
				System.out.println("not updated");
			
			
		} catch (SQLException | ClassNotFoundException  e) {
			e.printStackTrace();
		}finally{
			try {
				st.close();
				pre.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}


	}
	

}
