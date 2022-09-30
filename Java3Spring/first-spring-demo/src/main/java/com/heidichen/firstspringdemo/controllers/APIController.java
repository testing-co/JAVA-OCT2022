package com.heidichen.firstspringdemo.controllers;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class APIController {
	
	@RequestMapping("/option1") // default: GET
	public String option1() {
		return "Option 1";
	}
	
	@RequestMapping(value="/option2", method = RequestMethod.GET)
	public String option2() {
		return "Option 2";
	}
	
	@GetMapping("/option3") // PostMapping, PutMapping, DeleteMapping
	public String option3() {
		return "Option 3";
	}
	
}
