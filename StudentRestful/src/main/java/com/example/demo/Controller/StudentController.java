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

	
	Logger log = Logger.getAnonymousLogger();
	
	
	@Autowired
	StudentsDao dao;
	
	
	@PostMapping("/add")
	public Students AddStudent(@RequestBody Students s) {
		
		return dao.AddStudent(s);
	}
	

	
	@GetMapping("/showAll")
	public List<Students> ShowAllStudents(){
		
		return dao.SaveAll();
	}
	
	
	@GetMapping("/Show/{id}")
	public Optional<Students> findByid(@PathVariable long id) {
		
		return dao.getStudentsId(id);
	}
	


	
   
	@DeleteMapping("/delete/{id}")
	public String Delete(@PathVariable long id) {
		
		return dao.Delete(id);
	}
	
	@PutMapping("/updateStudents")
	public Students Update(@RequestBody Students student) {
		return dao.UpdateStudents(student);
	}
}
