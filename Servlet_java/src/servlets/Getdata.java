package servlets;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Student;
import DAO.Student_Dao;
import DAOImplement.Student_Implement;

@WebServlet("/Getdata")
public class Getdata extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Student_Dao std = null;
	PrintWriter pw = null;
	
    public Getdata() {
        super();
        std = new Student_Implement();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		pw = response.getWriter();
		pw.print("<table border='1' width='100%'");
		pw.print("<tr> <th>ID</th> <th>Name</th> <th>Branch</th> <th>Operations</th> </tr>");	
		List<Student> list = std.getData();
		list.forEach(s -> pw.println("<tr> <td>"+s.getStdId()+"</td> <td>"+s.getStdName()+"</td> <td>"+s.getStdBranch()+"</td>  <td><a href='UpdateFDate?id='"+s.getStdId()+"'>edit</a>  "+"  "+" <a href='DeleteData?id='"+s.getStdId()+"'>Delete</a> </td></tr>"));
//		ut.print("<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getPassword()+"</td> <td>"+e.getEmail()+"</td><td>"+e.getCountry()+"</td><td><a href='EditServlet?id="+e.getId()+"'>edit</a></td> <td><a href='DeleteServlet?id="+e.getId()+"'>delete</a></td></tr>");
		pw.print("</table><br><br>");
		
		pw.println("<a href = 'RegisterPage.jsp'>Insert</a>");
		
		pw.close();
	}



}
