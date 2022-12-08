package com.example.demo.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Students;
import com.example.demo.Services.StudentRepository;

@Service
public class StudentDao {

	@Autowired
	
	StudentRepository repo;
	
	
	//inserting students in students table
	
	public Students insert(Students s) {
		
		return repo.save(s);
	}
	
	
	
	// fetching students using students id from database
	
	
	
	public Optional<Students> getStudentById(long id) {
		
		return repo.findById(id);
	}
	
	

	// fetching all students using students id from database
	
	
	public List<Students> getAllStudents(){
		
		return repo.findAll();
	}
	
	
	// deleting students using id from database
	
	
	public String DeleteById(long id) {
		
		repo.deleteById(id);
		
		return "Successfully  deleted : "+id;
	}
	
	
	
	// updating marks using id from database
	
	
	
    public Students updateStudent(Students students) {
    	
    	long id = students.getId();
    	
    	Students std = repo.findById(id).get();
    	
    	std.setStudentname(students.getStudentname());
    	std.setSection(students.getSection());
    	std.setClas(students.getClas());
    	std.setEmail(students.getEmail());
    	std.setPassword(students.getPassword());
    	std.setFathername(students.getFathername());
        std.setMothername(students.getMothername());
        
        return repo.save(std);
    }
}
