package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



import Models.Students;

public class StudentDao {

	
	private Connection con;

	public StudentDao(Connection con) {
		super();
		this.con = con;
	}
	
	
	public boolean addStudent(Students student) {
		
		boolean f = false;
		
		try {
		
			String sql = "insert into students(Studentname,Section,Clas,Email,Password,Fathername,Mothername,Rollnumber) values (?,?,?,?,?,?,?,?)";
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			pst.setString(1, student.getStudentname());
			pst.setString(2, student.getSection());
		    pst.setString(3, student.getClas());
		    pst.setString(4, student.getEmail());
		    pst.setString(5, student.getPassword());
			pst.setString(6, student.getFathername());
			pst.setString(7, student.getMothername());
			pst.setInt(8, student.getRollnumber());
		    
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
	
	
	
	public List<Students> getAllStudents(){
		
		List<Students> list = new ArrayList<Students>();
		
		
		Students s = null;
		
		
		try {
			
			String sql = "select * from students";
			
			PreparedStatement pst = con.prepareStatement(sql);
			
			ResultSet rs = pst.executeQuery();
			
			
			while(rs.next())
			{
				
				s = new Students();
				
				s.setRollnumber(rs.getInt(1));
				s.setStudentname(rs.getString(2));
				s.setSection(rs.getString(3));
				s.setClas(rs.getString(4));
				s.setEmail(rs.getString(5));
				s.setPassword(rs.getString(6));
				s.setFathername(rs.getString(7));
				s.setMothername(rs.getString(8));
				
				
				list.add(s);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
       
        
        public Students getByStudentId(int Rollnumber) {
        	
        	
        	Students s = null;
        	
        	
        	try {
        		
        		String sql = "select * from students where Rollnumber = ?";
        		
        		PreparedStatement pst = con.prepareStatement(sql);
        		
        		pst.setInt(1, Rollnumber);
        		
        		ResultSet rs = pst.executeQuery();
        	
        		   while(rs.next())
      		    	 
      		     {
      		    	 
      		    	 s = new Students();
      		    	 
      		    	 s.setRollnumber(rs.getInt(1));
      		    	 s.setStudentname(rs.getString(2));
      		    	 s.setSection(rs.getString(3));
      		    	 s.setClas(rs.getString(4));
      		    	 s.setEmail(rs.getString(5));
      		    	 s.setPassword(rs.getString(6));
      		    	 s.setFathername(rs.getString(7));
      		    	 s.setMothername(rs.getString(8));
      		    	 
        		
        	}
        		   
        	}
        	catch (Exception e) {
				// TODO: handle exception
			}
        	return s;
        }
      
        
        
        
        public boolean updateStudent(Students student) {

    		boolean f = false;

    		try {

    			String sql = "update students set Studentname=?,Section=?,Clas=?,Email=?,Password=?,Fathername =?,Mothername =? where Rollnumber =?";

    			PreparedStatement pst = con.prepareStatement(sql);
    			
    			pst.setString(1, student.getStudentname());
    			pst.setString(2, student.getSection());
    			pst.setString(3, student.getClas());
    			pst.setString(4, student.getEmail());
    			pst.setString(5, student.getPassword());
    			pst.setString(6, student.getFathername());
    			pst.setString(7, student.getMothername());
    			pst.setInt(8, student.getRollnumber());
    			
    			int i = pst.executeUpdate();

    			if (i == 1) {
    				f = true;
    			}
    		} catch (Exception e) {
    			e.printStackTrace();
    		}
    		return f;
    	}
      
        
        
        public boolean deleteStudent(int Rollnumber) {
    		
    		boolean f = false;
    		
    		try {
    			
    			String sql ="delete from students where Rollnumber = ?";
    			
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