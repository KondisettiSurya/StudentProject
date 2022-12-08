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
import Models.Marks;
import Models.Students;


@WebServlet("/update")
public class UpdateMarksServlets extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	    int English = Integer.parseInt(request.getParameter("English"));
	    
	    int Hindi = Integer.parseInt(request.getParameter("Hindi"));
	    
	    int Telugu = Integer.parseInt(request.getParameter("Telugu"));
	    
	    int Maths = Integer.parseInt(request.getParameter("Maths"));
	    
	    int Science = Integer.parseInt(request.getParameter("Science"));
	    
	    int Social = Integer.parseInt(request.getParameter("Social"));
	    
		int Rollnumber = Integer.parseInt(request.getParameter("Rollnumber"));

		Marks  marks = new Marks(Rollnumber, English, Hindi, Telugu, Maths, Science, Social);
		
		MarksDao dao1 = new MarksDao(StudentDb.getConn());

		HttpSession session = request.getSession();

		boolean f = dao1.updateMarks(marks);

		if (f) {

			session.setAttribute("SuccMsg", " Updated student successfully .... ");
			
			System.out.println("Updated successfully");
			
			response.sendRedirect("AllMarks.jsp");
		}
		
		else
		{
			
	       session.setAttribute("ErrorMsg", " Invaild Operation .... ");
			
			System.out.println("Invaild Operation ....");
			
			response.sendRedirect("AllMarks.jsp");
			
		}
	}
	
}
