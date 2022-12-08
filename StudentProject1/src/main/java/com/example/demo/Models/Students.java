package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Students {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	private String Studentname;
	
	private String Clas;
	
	private String Section;
	
	private String Email;
	
	private String Password;
	
	private String Fathername;
	
	private String Mothername;
	
}
