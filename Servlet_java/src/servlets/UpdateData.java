package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.Student_Dao;
import DAOImplement.Student_Implement;
import Model.Student;


@WebServlet("/UpdateData")
public class UpdateData extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	Student_Dao std = null;
	PrintWriter pw = null;
	
    public UpdateData() {
        super();
        std = new Student_Implement();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		pw = response.getWriter();
		Student s = new Student();
		s.setStdId(request.getParameter("ids"));
		s.setStdName(request.getParameter("sname"));
		s.setStdBranch(request.getParameter("branch"));
//		pw.println("kk" + s.getStdId() + s.getStdBranch() + s.getStdName());
		if(std.updateData(s))
			pw.println("Inserted");
		else
			pw.println("Not Inserted");
		
//		response.sendRedirect("GetAllDetailsPage.jsp");
		
	}



}
