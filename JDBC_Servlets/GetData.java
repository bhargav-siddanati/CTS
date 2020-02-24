package com.cts.Testing;

import java.sql.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GetData")
public class GetData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public GetData() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	
	protected boolean getDetails(String emailid, String psw) {
		boolean checker = false; 
		Connection con = null;
		PreparedStatement pre = null;
		try {
			String url = "jdbc:mysql://localhost:3306/Bhargav";
			String user = "root";
			String password = "Bhargav@123";
			
			String sql = "select EmailId,Pwd from Login_cred where EmailId=? and Pwd=?";
			
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection(url, user, password);
			
			pre = con.prepareStatement(sql);
			
			pre.setString(1, emailid);
			pre.setString(2, psw);
			
			ResultSet re = pre.executeQuery();
			
			if(re.next() != false) {
				checker = true;
			}
			else
				checker = false;
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				pre.close();
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
		}
		
		return checker;
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		RequestDispatcher rd = null;
		PrintWriter write = response.getWriter();
		
		String emailid = request.getParameter("email");
		String psw = request.getParameter("pwd");
		
		boolean getvalue = getDetails(emailid,psw); 
		if(getvalue) {
			rd = request.getRequestDispatcher("/Home");
			rd.forward(request, response);
		}
		else {
			rd = request.getRequestDispatcher("Index.html");
			write.println("Sorry  Your  " + emailid + "  and  Password  were  wrong") ;
			rd.include(request, response);
		}
	}

}
