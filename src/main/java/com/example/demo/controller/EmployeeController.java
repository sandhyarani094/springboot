package com.example.demo.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.model.Resp;
import com.example.demo.repository.EmployeeRepository;
@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class EmployeeController {
	@Autowired
	EmployeeRepository emprepo;
	
	@GetMapping("/getAllEmployees")
	public Iterable<Employee> getAllEmployee(){
		return emprepo.findAll();
	}
	
	@PostMapping("/saveEmployee")
	public Resp saveEmployee(@RequestBody Employee emp) {
		emprepo.save(emp);
		Resp resp=new Resp();
		
		resp.setResponseValue("Employee added successfully");
		return resp;
		
	}
	
	@PostMapping("/findEmployee")
	public Optional<Employee> findEmployee(@RequestBody Integer eno) {
		
		return emprepo.findById(eno);
	}
	
	@PostMapping("/deleteEmployee")
	public String deleteEmployee(@RequestBody Integer eno) {
		
		emprepo.deleteById(eno);
		
		return "successfully deleted with eno"+eno;
	}
	
	@PutMapping("/saveEmployee")
	public String saveEmployeeByPut(@RequestBody Employee emp) {
		emprepo.save(emp);
		
		return "Employee added successfully";
	}
	 
	@PatchMapping("/saveEmployee")
	public String saveEmployeeByPatch(@RequestBody Employee emp) {
		emprepo.save(emp);
		
		return "Employee added successfully";
	}	
	
	
  
	
	

}
