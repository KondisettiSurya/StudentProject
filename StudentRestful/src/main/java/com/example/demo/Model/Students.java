package com.example.demo.Model;

import javax.persistence.*;

import lombok.Data;


@Data
@Entity
public class Students {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String Studentname;
	private String Section;
	private int clas;
	private int English;
	private int Hindi;
	private int Science;
	private int Telugu;
	private int Social;
	private int Maths;
	private double TotalMarks;
	private int percentage;
	
	
	
}
