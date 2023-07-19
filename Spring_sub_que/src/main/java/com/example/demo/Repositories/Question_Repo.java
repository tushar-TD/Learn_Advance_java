package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Questions;

@Repository
public interface Question_Repo extends JpaRepository<Questions, Integer>{

}
