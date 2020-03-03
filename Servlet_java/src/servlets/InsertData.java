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

@WebServlet("/InsertData")
public class InsertData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	Student_Dao std = null;
	PrintWriter pw = null;
	
    public InsertData() {
        super();
        std = new Student_Implement();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		
		String id = request.getParameter("id");
		String name = request.getParameter("sname");
		String branch = request.getParameter("branch");
		
		Student std1 = new Student();
		std1.setStdId(id);
		std1.setStdName(name);
		std1.setStdBranch(branch);
		boolean b = std.insertData(std1);
		if(b)
			pw.println("Inserted");
		
	}

}
