package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.*;
import com.example.demo.Respository.StudentsReporestiory;

@Service
public class StudentsDao {

	
	@Autowired
	StudentsReporestiory repo;
	
	
    //insert 
	
	public Students AddStudent(Students s) {

		
		
    double Totalmarks= s.getEnglish()+s.getHindi()+s.getMaths()+s.getScience()+s.getSocial()+s.getTelugu();
		 
	s.setTotalMarks(Totalmarks);
	
	int percentage = (int) ((Totalmarks/600)*100);
			
	s.setPercentage(percentage);
	
		return repo.save(s);
	}
	
	
	// select by id
	
	
	public Optional<Students> getStudentsId(long id) {
		
		return repo.findById(id);
		
	}
	
    
	//Get All User
    
	public List<Students> SaveAll(){
		
		return repo.findAll();
	}
	
	
	
	// Delete Students By Id
	
	
	public String Delete(long id) {
		
		 repo.deleteById(id);
		 
		 return "Successfully deleted : "+ id;
	}
	
	
	//update Students
	
	
	public Students UpdateStudents(Students student) {
	
		
		long id= student.getId();
		
		Students std= repo.findById(id).get();
		
		std.setStudentname(student.getStudentname());
		std.setSection(student.getSection());
		std.setClas(student.getClas());
		std.setEnglish(student.getEnglish());
		std.setHindi(student.getHindi());
		std.setScience(student.getScience());
		std.setTelugu(student.getTelugu());
		std.setSocial(student.getSocial());
		std.setMaths(student.getMaths());
		std.setTotalMarks(student.getEnglish()+student.getHindi()+student.getScience()+student.getTelugu());
	
		int percentage = (int) ((std.getTotalMarks()/400)*100);
		
		std.setPercentage(percentage);
		
		return repo.save(std);
	}
}
