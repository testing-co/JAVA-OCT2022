package com.heidichen.firstspringdemo.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RoutesController {
	
	// localhost:8080/search?festival=halloween
	@RequestMapping("/search")
	public String searchFestival(@RequestParam("festival") String fest) {
		return "Festival is "+ fest;
	}
	
	// localhost:8080/pet?name="pepper"&age=14
	@RequestMapping("/pet")
	public String pet(
			@RequestParam(value = "name", required=false) String nameInMethod,
			@RequestParam(value="age", required=false) Integer ageInMethod
			) {
		if(nameInMethod==null) {
			return "There is no name for this pet";
		}
		String message= "";
		if(ageInMethod < 10) {
			message= "This is a young pet";
		}else {
			message ="This is old!";
		}
		return nameInMethod + " is " + ageInMethod + " years old. "+message;
	}
	
	@RequestMapping("/activity/{festival}")
	public String festivalPath(@PathVariable("festival") String fest) {
		return "My favorite festival is "+fest; 
	}

}
