package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Resp;
import com.example.demo.model.User;
import com.example.demo.model.UserCredential;
import com.example.demo.repository.UserRepository;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
public class UserController {
	@Autowired
	UserRepository userrepo;
	
	@GetMapping("/getAllUser")
	public Iterable<User> getAllUser(){
		return userrepo.findAll();
	}
	

	@PostMapping("/saveUser")
	public Resp saveUser(@RequestBody User user) {
		userrepo.save(user);
		Resp resp=new Resp();
		resp.setResponseValue("user save successfully");
		return resp;
	}
	
	@PostMapping("/login")
	public User login(@RequestBody UserCredential user) {
		return userrepo.login(user.getMailid(),user.getPw());
		
	}
	
}
		
	
		


