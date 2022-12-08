package Servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import DBConnection.StudentDb;
import Dao.MarksDao;
import Dao.StudentDao;



@WebServlet("/deletemark")
public class DeleteMarkServlet extends HttpServlet{

	
	 protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			
	        int Rollnumber =Integer.parseInt(req.getParameter("Rollnumber"));
			
			MarksDao dao = new MarksDao(StudentDb.getConn());
			
			HttpSession session = req.getSession();
			
			boolean f = dao.deleteMarks(Rollnumber);
			
			
			if(f)
			{
				session.setAttribute("SuccMsg","deleted successfully ...");
				
				System.out.println("deleted successfully ...");
				
				resp.sendRedirect("AllMarks.jsp");
			}
			
			else
			{
	            session.setAttribute("ErrorMsg","Check the connection ....");
				
				System.out.println("Check the connection ....");
				
				resp.sendRedirect("AllMarks.jsp");
			}
			
	}
}
