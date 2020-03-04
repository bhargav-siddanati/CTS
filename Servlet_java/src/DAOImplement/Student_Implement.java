package DAOImplement;

import java.sql.*;
import java.util.*;

import Connection.JDBC_Connection;
import DAO.Student_Dao;
import Model.Student;

public class Student_Implement implements Student_Dao {

	Connection con = null;
	List<Student> list = new ArrayList<Student>();

	@Override
	public boolean insertData(Student std) {
		PreparedStatement pre = null;
		boolean b = false;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = JDBC_Connection.getConnection();

			String sql1 = "select stdId from StudentDetails where stdId=?";
			String sql2 = "insert into StudentDetails(stdId,setName,stdBranch) values(?,?,?)";

			pre = con.prepareStatement(sql1);
			pre.setString(1, std.getStdId());

			int check = pre.executeUpdate();
			if (check <= 0)
				b = false;
			else {
				pre = con.prepareStatement(sql2);
				pre.setString(1, std.getStdId());
				pre.setString(2, std.getStdName());
				pre.setString(3, std.getStdBranch());

				pre.executeUpdate();

				b = true;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pre.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return b;
	}

	@Override
	public void deleteData(String id) {
		PreparedStatement pre = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = JDBC_Connection.getConnection();

			String sql = "delete from StudentDetails where stdId=?";

			pre = con.prepareStatement(sql);
			pre.setString(1, id);

			pre.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pre.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public void updateData(String id) {
		PreparedStatement pre = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = JDBC_Connection.getConnection();

			String sql = "update StudentDetails set stdName=?,stdBranch=? where stdId=?";

			pre = con.prepareStatement(sql);
			pre.setString(1, id);

			pre.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				pre.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}
	}

	@Override
	public List<Student> getData() {
		Statement st = null;
		try {

			Class.forName("com.mysql.jdbc.Driver");
			con = JDBC_Connection.getConnection();

			String sql = "select stdNo,stdId,stdName,stdBranch from StudentDetails";

			st = con.createStatement();
			ResultSet rt = st.executeQuery(sql);

			while (rt.next()) {

				Student std = new Student();
				std.setStdId(rt.getString(2));
				std.setStdName(rt.getString(3));
				std.setStdBranch(rt.getString(4));
				list.add(std);
				st.close();
				con.close();
			}

		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				st.close();
				con.close();
			} catch (Exception e) {
				e.printStackTrace();
			}

		}

		return list;
	}

}
