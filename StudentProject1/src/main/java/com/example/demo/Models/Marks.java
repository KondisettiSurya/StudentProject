package com.example.demo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;


@Data
@Entity
public class Marks {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	private long id;
	
	private int English;
	
	private int Hindi;
	
	private int Telugu;
	
	private int Maths;
	
	private int Science;
	
	private int Social;
	
	private double Totalmarks;
	
	private int Percentage;
}
