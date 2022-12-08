package Dao;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import Models.Marks;
import Models.Students;

public class MarksDao {

	
	private Connection con;

	public MarksDao(Connection con) {
		super();
		this.con = con;
	}
	
	
	public boolean addMarks(Marks marks) {
		
		boolean f= false;
		
		try {
			
			String sql = "insert into studentMarks(Rollnumber,English,Hindi,Telugu,Maths,Science,Social) values (?,?,?,?,?,?,?)";
			
			PreparedStatement pst =con.prepareStatement(sql);
			
			pst.setInt(1, marks.getRollnumber());
			pst.setInt(2, marks.getEnglish());
			pst.setInt(3, marks.getHindi());
			pst.setInt(4, marks.getTelugu());
			pst.setInt(5, marks.getMaths());
			pst.setInt(6, marks.getScience());
			pst.setInt(7, marks.getSocial());
			
			int i = pst.executeUpdate();
			
			if(i==1)
			{
				
				f = true;
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return f;
		
	}
	
	
	public List<Marks> getAllMarks(){
		
		List<Marks> list = new ArrayList<Marks>();
		
		Marks m = null;
		
		try {
			
			String sql = "select * from studentMarks";
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			
		        ResultSet rs = pst.executeQuery();
		        
		        while(rs.next())
		        {
		        	m = new Marks();
		        	
		        	m.setRollnumber(rs.getInt(1));
		        	m.setEnglish(rs.getInt(2));
		        	m.setHindi(rs.getInt(3));
		        	m.setTelugu(rs.getInt(4));
		        	m.setMaths(rs.getInt(5));
		        	m.setScience(rs.getInt(6));
		        	m.setSocial(rs.getInt(7));
		        	
		        	
		        	list.add(m);
		             
		        }
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
	
	 public Marks getByMarksId(int Rollnumber) {
     	
     	
     	Marks m = null;
     	
     	
     	try {
     		
     		String sql = "select * from studentmarks where Rollnumber = ?";
     		
     		PreparedStatement pst = con.prepareStatement(sql);
     		
     		pst.setInt(1, Rollnumber);
     		
     		ResultSet rs = pst.executeQuery();
     	
     		   while(rs.next())
   		    	 
   		     {
   		    	 
   		    	 m = new Marks();
   		    	 
   		    	 m.setRollnumber(rs.getInt(1));
   		    	 m.setEnglish(rs.getInt(2));
   		    	 m.setHindi(rs.getInt(3));
   		    	 m.setTelugu(rs.getInt(4));
   		    	 m.setMaths(rs.getInt(5));
   		    	 m.setScience(rs.getInt(6));
   		    	 m.setSocial(rs.getInt(7));
   		    	 
     		
     	}
     		   
     	}
     	catch (Exception e) {
				e.printStackTrace();
			}
     	return m;
     }
   
     
     
     
     public boolean updateMarks(Marks marks) {

 		boolean f = false;

 		try {

 			String sql = "update studentmarks set English=?,Hindi=?,Telugu=?,Maths=?,Science=?,Social =? where Rollnumber =?";

 			PreparedStatement pst = con.prepareStatement(sql);
 			
 			pst.setInt(1, marks.getEnglish());
 			pst.setInt(2, marks.getHindi());
 			pst.setInt(3, marks.getTelugu());
 			pst.setInt(4, marks.getMaths());
 			pst.setInt(5, marks.getScience());
 			pst.setInt(6, marks.getSocial());
 		
 			int i = pst.executeUpdate();

 			if (i == 1) {
 				f = true;
 			}
 		} catch (Exception e) {
 			e.printStackTrace();
 		}
 		return f;
 	}
   
     
     
     public boolean deleteMarks(int Rollnumber) {
 		
 		boolean f = false;
 		
 		try {
 			
 			String sql ="delete from studentmarks where Rollnumber = ?";
 			
 			PreparedStatement pst = con.prepareStatement(sql);
 			
 			pst.setInt(1, Rollnumber);
 			
 			int i =pst.executeUpdate();
 			
 			if(i==1) {
 				
 				f = true;
 				
 				
 			}
 		}
 		catch (Exception e) {
 			e.printStackTrace();
 		}
 		
 		return f;
 	}
}
