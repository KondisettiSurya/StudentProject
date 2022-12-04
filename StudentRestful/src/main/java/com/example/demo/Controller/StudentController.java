package com.example.demo.Controller;




import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Model.*;
import com.example.demo.Service.StudentsDao;

import java.util.List;
import java.util.Optional;
import java.util.logging.*;


@RestController
@RequestMapping("/api/v1")
public class StudentController {

	
	// used to check the errors
	
	Logger log = Logger.getAnonymousLogger();
	
	
	@Autowired
	StudentsDao dao;
	
	
	// Adding the details to mysql
	
	@PostMapping("/add")
	public Students AddStudent(@RequestBody Students s) {
		
		return dao.AddStudent(s);
	}
	

	// fetching the details using students id
	
	
	@GetMapping("/showAll")
	public List<Students> ShowAllStudents(){
		
		return dao.SaveAll();
	}
	
	
	// fetching the all details of Students in database
	
	@GetMapping("/Show/{id}")
	public Optional<Students> findByid(@PathVariable long id) {
		
		return dao.getStudentsId(id);
	}
	

	
	// Deleting the details using Student id

	
   
	@DeleteMapping("/delete/{id}")
	public String Delete(@PathVariable long id) {
		
		return dao.Delete(id);
	}
	
	
	// updating the student details
	
	@PutMapping("/updateStudents")
	public Students Update(@RequestBody Students student) {
		return dao.UpdateStudents(student);
	}
}
