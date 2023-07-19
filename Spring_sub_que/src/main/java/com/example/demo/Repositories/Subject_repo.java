package com.example.demo.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Subject;

@Repository
public interface Subject_repo extends JpaRepository<Subject, Integer>{

}
