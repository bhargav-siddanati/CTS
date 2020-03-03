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
		
		String st = request.getParameter("id");
		
		if(std.updateData(st))
			pw.println("Inserted");
		else
			pw.println("Not Inserted");
		
		response.sendRedirect("GetAllDetailsPage.jsp");
		
	}



}
