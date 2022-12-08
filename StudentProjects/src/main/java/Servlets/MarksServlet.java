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
import Models.Marks;

@WebServlet("/addmarks")
public class MarksServlet extends HttpServlet{

	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		int Rollnumber = Integer.parseInt(req.getParameter("Rollnumber"));
		
		int English = Integer.parseInt(req.getParameter("English"));
		
		int Hindi = Integer.parseInt(req.getParameter("Hindi"));
		
		int Telugu = Integer.parseInt(req.getParameter("Telugu"));
		
		int Maths = Integer.parseInt(req.getParameter("Maths"));
		
		int Science = Integer.parseInt(req.getParameter("Science"));
		
		int Social = Integer.parseInt(req.getParameter("Social"));
		
		
		Marks mark = new Marks(Rollnumber, English, Hindi, Telugu, Maths, Science, Social);
		
		HttpSession session = req.getSession();
		
		MarksDao dao = new MarksDao(StudentDb.getConn());
		
		 boolean f = dao.addMarks(mark);
		 
		 if(f)
		 {
			 
			 session.setAttribute("SuccMsg","Marks entered Successfully ....");
			 
			 System.out.println("Marks entered Successfully ....");
			 
			 resp.sendRedirect("Home.jsp");
		 }
		 
		 else
		 {
             session.setAttribute("SuccMsg","check the connection ....");
			 
			 System.out.println("check the connection ....");
			 
			 resp.sendRedirect("Marks.jsp");
		 }
	}
	
	
}
