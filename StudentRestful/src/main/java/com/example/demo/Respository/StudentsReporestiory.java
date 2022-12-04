package com.example.demo.Respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Students;


@Repository

public interface StudentsReporestiory  extends JpaRepository<Students, Long>{


}
