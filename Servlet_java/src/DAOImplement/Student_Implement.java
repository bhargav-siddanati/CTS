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

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = JDBC_Connection.getConnection();
			con.setAutoCommit(false);
			
			String sql2 = "insert into StudentDetails(stdId,stdName,stdBranch) values(?,?,?)";

				pre = con.prepareStatement(sql2);
				pre.setString(1, std.getStdId());
				pre.setString(2, std.getStdName());
				pre.setString(3, std.getStdBranch());

				int check = pre.executeUpdate();
				con.commit();
				
				if(check <= 0)
					b = false;
				else
					b = true;
			

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
	public boolean deleteData(String id) {
		boolean b = false;
		PreparedStatement pre = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = JDBC_Connection.getConnection();
			con.setAutoCommit(false);
			String sql = "delete from StudentDetails where stdId=?";

			pre = con.prepareStatement(sql);
			pre.setString(1, id);

			int check = pre.executeUpdate();
			con.commit();
			
			if(check<=0)
				b = false;
			else
				b = true;
			
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
	public boolean updateData(Student d) {
		boolean b = false;
		PreparedStatement pre = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = JDBC_Connection.getConnection();
			con.setAutoCommit(false);
			String sql = "update StudentDetails set stdName=?,stdBranch=? where stdId=?";

			pre = con.prepareStatement(sql);
			pre.setString(1, d.getStdName());
			pre.setString(2, d.getStdBranch());
			pre.setString(3, d.getStdId());

			int check= pre.executeUpdate();
			con.commit();
			
			if(check<=0)
				b = false;
			else
				b = true;
			
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
	public List<Student> getData() {
		Statement st = null;
		try {

			Class.forName("com.mysql.cj.jdbc.Driver");
			con = JDBC_Connection.getConnection();

			String sql = "select stdNo,stdId,stdName,stdBranch from StudentDetails";

			st = con.createStatement();
			ResultSet rt = st.executeQuery(sql);

			while (rt.next()) {
				Student std = new Student();
				std.setStdNo(rt.getString(1));
				std.setStdId(rt.getString(2));
				std.setStdName(rt.getString(3));
				std.setStdBranch(rt.getString(4));
				list.add(std);
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
