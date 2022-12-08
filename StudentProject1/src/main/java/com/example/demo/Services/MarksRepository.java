package com.example.demo.Services;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Models.Marks;

@Repository
public interface MarksRepository extends JpaRepository<Marks, Long> {

}
