package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository emprepo;
	
	@GetMapping("/getAllEmployees")
	public Iterable<Employee> getAllEmployee(){
		return emprepo.findAll();
	}
	
	

}
