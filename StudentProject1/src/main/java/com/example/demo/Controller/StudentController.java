package com.example.demo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Dao.StudentDao;
import com.example.demo.Models.Students;

@RestController
@RequestMapping("/api/v1")
public class StudentController {


	// Students  Dao  connection to controller
	
	@Autowired
	
	StudentDao dao;
	
	

	//adding the students 
	

	@PostMapping("/insert")
	public Students insert(@RequestBody Students s) {
		
		return dao.insert(s);
	}
	
	
	
	// fetch the data using Student id
	
	
	
	@GetMapping("/getbyid/{id}")
	public Optional<Students> getByStudentId(@PathVariable long id) {
		
		return dao.getStudentById(id);
	}
	
	
	// fetching all students data
	
	
	@GetMapping("/getall")
	public List<Students> getAllStudents(){
		
		return dao.getAllStudents();
	}
	
	
	// deleting student details using id

	@DeleteMapping("/delete/{id}")
	public String DeleteById(@PathVariable long id) {

        return dao.DeleteById(id);
	}
	

	// updating students details using students details
	
	
	@PutMapping("/update")
	public Students UpdateStudent(@RequestBody Students students) {
		
		return dao.updateStudent(students);
	}
}