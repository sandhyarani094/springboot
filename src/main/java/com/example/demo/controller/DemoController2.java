package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController2 {
	@RequestMapping("/topics")
	public List<String> getAllTopics()
	{
		 String[] array = {"physics", "chemistry", "math", "english"};
		 List<String> list = Arrays.asList(array);      
		 return list;
	}

}
