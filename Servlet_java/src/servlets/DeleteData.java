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


@WebServlet("/DeleteData")
public class DeleteData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Student_Dao std = null;
	PrintWriter pw = null;

    public DeleteData() {
        super();
        std = new Student_Implement();
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		pw = response.getWriter();
		String st = request.getParameter("id");
		
		pw.println("lolol " + st);
		
		if(std.deleteData(st))
			pw.println("deleted");
		else
			pw.println("Not deleted");
		
		response.sendRedirect("GetAllDetailsPage.jsp");
	}


}
