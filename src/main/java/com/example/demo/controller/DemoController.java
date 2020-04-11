package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	@GetMapping("/getName")
	public String getName()
	{
		return "sandy";
	}
	@GetMapping("/getNames")
	public List<String> getNames()
	{
		 String[] array = {"a", "b", "c", "d", "e"};
		 List<String> list = Arrays.asList(array);      
		 return list;
	}

}
