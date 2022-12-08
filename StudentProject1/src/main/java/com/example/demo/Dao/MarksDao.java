package com.example.demo.Dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Models.Marks;

import com.example.demo.Services.MarksRepository;

@Service
public class MarksDao {

	
	@Autowired
	
	MarksRepository repo;
	
	
	//inserting marks in marks table
	
	public Marks AddMarks(Marks m) {
	
		double Totalmarks = m.getEnglish()+m.getHindi()+m.getTelugu()+m.getMaths()+m.getScience()+m.getSocial();
		
		m.setTotalmarks(Totalmarks);
		
		
		int Percentage = (int) ((Totalmarks/600)*100);
		
		m.setPercentage(Percentage);
		
		return repo.save(m);
	}
	
	
	// fetching marks using marks id from database
	
	
	public Optional<Marks> getByMarkId(long id) {
		
		return repo.findById(id);
	}
	
	
	// fetching all marks using marks id from database
	
	public List<Marks> getAllMarks(){
		
		return repo.findAll();
	}
	
	
	// deleting marks using id from database
	
	
	public String deletemarks(long id) {
		
		 repo.deleteById(id);
	
		 return "Successfully deleted : "+id;
	}

	
	// updating marks using id from database
	
	
	public Marks updatemarks(Marks m) {
		
		long id = m.getId();
		
		Marks ms = repo.findById(id).get();
		
		ms.setEnglish(m.getEnglish());
		ms.setHindi(m.getHindi());
		ms.setTelugu(m.getTelugu());
		ms.setMaths(m.getMaths());
		ms.setScience(m.getScience());
		ms.setSocial(m.getSocial());
		ms.setTotalmarks(m.getEnglish()+m.getHindi()+m.getTelugu()+m.getMaths()+m.getScience()+m.getSocial());
		
		int Percentage = (int) ((ms.getTotalmarks()/600)*100);
		
		ms.setPercentage(Percentage);
		
		return repo.save(ms);
	}
}