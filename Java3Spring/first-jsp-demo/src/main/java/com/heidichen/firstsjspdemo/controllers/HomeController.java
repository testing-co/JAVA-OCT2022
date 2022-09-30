package com.heidichen.firstsjspdemo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // allows you to display jsp file as the view
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "home.jsp";
	}
	
	@RequestMapping("/jstl")
	public String renderingDataDemo(Model model) {
		String name = "Alex Miller";
		Integer age = 14;
		boolean isHungry = true;;
		String hackerScript = "<script>alert('hi')</script>";
		model.addAttribute("jspName", name);
		model.addAttribute("jspAge", age);
		model.addAttribute("jspHungry", isHungry);
		model.addAttribute("hackerScript", hackerScript);
		
		ArrayList<String> skills = new ArrayList<>();
		skills.add("debugging skills");
		skills.add("barista skills");
		skills.add("breaking the code");
		skills.add("losing braincell");
		model.addAttribute("jspSkills", skills);
		
		for(String eachSkill : skills) {
			System.out.println(eachSkill);
		}
		
		
		
 		return "jstlDemo.jsp";
	}
}
