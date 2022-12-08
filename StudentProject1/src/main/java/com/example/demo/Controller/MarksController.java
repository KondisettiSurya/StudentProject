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

import com.example.demo.Dao.MarksDao;
import com.example.demo.Models.Marks;

@RestController

@RequestMapping("/api/v1")
public class MarksController {

	
	// Marks  Dao  connection to controller
	
	@Autowired
	
	MarksDao dao;
	
	
	
	//adding the students marks
	
	@PostMapping("/addmarks")
	public Marks AddMarks(@RequestBody Marks m) {
		
		return dao.AddMarks(m);
	}
	
	
	// fetch the data using Student id
	
	
	@GetMapping("/getbymark/{id}")
	public Optional<Marks> getMarksById(@PathVariable long id) {
		
		return dao.getByMarkId(id);
	}
	
	
	// fetching all students marks data
	
	@GetMapping("/allmarks")
	public List<Marks> getAllMarks(){
		
		
		return dao.getAllMarks();
	}
	
	
	// deleting student marks details using id
	
	
	@DeleteMapping("/marksdelete/{id}")
	public String deletemarks(@PathVariable long id) {
		
		return dao.deletemarks(id);
	}
	
	
	// updating marks using marks details  
	
	
	@PutMapping("/updatemark")
	public Marks updatemarks(@RequestBody Marks m) {
		
		return dao.updatemarks(m);
	}
	
}
