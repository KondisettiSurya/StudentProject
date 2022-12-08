package com.example.demo.Services;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Students;

@Repository
public interface StudentRepository extends JpaRepository<Students, Long>{

	
}
