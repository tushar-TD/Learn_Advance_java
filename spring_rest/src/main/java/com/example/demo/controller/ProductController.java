package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.example.demo.entities.Product;
import com.example.demo.services.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService pservice;
	
	@GetMapping("/getProduct")
	public Product getOne(@RequestParam("prid") int pid)
	{
		return pservice.getOne(pid);
	}

	@GetMapping("/getAllP")
	public List<Product> getAll()
	{
		return pservice.getAll();
	}
	
	@PostMapping("/saveP")
	public Product saveP(@RequestBody Product p)
	{
		System.out.println(p);
		return pservice.save(p);
	}
}
