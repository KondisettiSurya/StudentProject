package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBConnection.StudentDb;
import Dao.StudentDao;
import Models.Students;

@WebServlet("/updateuser")
public class UpdateStudentServlet extends HttpServlet {

	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String Studentname = request.getParameter("Studentname");
		String Section = request.getParameter("Section");
	    String Clas = request.getParameter("Clas");
	    String Email = request.getParameter("Email");
	    String Password = request.getParameter("Password");
	    String Fathername = request.getParameter("Fathername");
	    String Mothername = request.getParameter("Mothername");
		int Rollnumber = Integer.parseInt(request.getParameter("Rollnumber"));

		Students student = new Students(Studentname, Section, Clas, Email, Password, Fathername, Mothername, Rollnumber);

		StudentDao dao  = new StudentDao(StudentDb.getConn());

		HttpSession session = request.getSession();

		boolean f = dao.updateStudent(student);

		if (f) {

			session.setAttribute("SuccMsg", " Updated student successfully .... ");
			
			System.out.println("Updated successfully");
			
			response.sendRedirect("AllStudents.jsp");
		}
		
		else
		{
			
	       session.setAttribute("ErrorMsg", " Invaild Operation .... ");
			
			System.out.println("Invaild Operation ....");
			
			response.sendRedirect("AllStudents.jsp");
			
		}
	}
}
