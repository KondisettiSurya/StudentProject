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


@WebServlet("/register")
public class StudentServlet  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String Studentname = req.getParameter("Studentname");
			
		String Section = req.getParameter("Section");
		
		String Clas = req.getParameter("Clas");
		
		String Email = req.getParameter("Email");
		
		String Password = req.getParameter("Password");
		
		String Fathername = req.getParameter("Fathername");
		
		String Mothername = req.getParameter("Mothername");
		
		int Rollnumber =  Integer.parseInt(req.getParameter("Rollnumber")); 
		
		Students student = new Students(Studentname, Section, Clas, Email, Password, Fathername , Mothername, Rollnumber);
		
		StudentDao dao = new StudentDao(StudentDb.getConn());
		
		HttpSession session = req.getSession();
		
		boolean f = dao.addStudent(student);
		
		if(f)
		{
			
			session.setAttribute("SuccMsg", "Successfully inserted ....");
			
			System.out.println("Successfully inserted ....");
			
			resp.sendRedirect("Home.jsp");
		}
		
		else
		{
	        session.setAttribute("ErrorMsg", "check the connection ....");
			
			System.out.println("check the connection ....");
			
			resp.sendRedirect("AddStudents.jsp");
		}
			
	}
	
	
}
