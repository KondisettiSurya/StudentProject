package com.example.demo.Model;

import javax.persistence.*;

import lombok.Data;

//lombok for creating getters and setter automically

@Data


// Hibernate property for creating Table 

@Entity
public class Students {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)

	//Students Details 
	
	private long id;
	private String Studentname;
	private String Section;
	private int clas;
	
	//Marks details
	
	private int English;
	private int Hindi;
	private int Science;
	private int Telugu;
	private int Social;
	private int Maths;
	
	
	// scores
	
	private double TotalMarks;
	private int percentage;
	
	
	
}
