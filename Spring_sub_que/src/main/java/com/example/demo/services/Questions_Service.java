package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repositories.Question_Repo;
import com.example.demo.entities.Subject;

@Service
public class Questions_Service {

	@Autowired
	Question_Repo qrepo; 
	
	public Subject getOne(int qid)
	{
		return qrepo.findById(qid).get();
	}
	public List<Subject> getAll()
	{
		return qrepo.findAll();
	}

}
