package com.heidichen.onetomanydemo.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.heidichen.onetomanydemo.models.Donation;
import com.heidichen.onetomanydemo.models.User;
import com.heidichen.onetomanydemo.services.MainService;

@Controller
public class HomeController {
	@Autowired
	private MainService mainService;
	
	@GetMapping("/")
	public String donationDashboard(Model model) {
		model.addAttribute("donationList", mainService.allDonations());
		model.addAttribute("userList", mainService.allUsers());
		return "donationDashboard.jsp";
	}
	
	
	// create 
	// 1. show the form
	@GetMapping("/users/new")
	public String showUserForm(Model model) {
		model.addAttribute("newUser", new User());
		return "newUser.jsp";
	}
	
	// 2. process
	@PostMapping("/users/process")
	public String processUserForm(
			@Valid @ModelAttribute("newUser") User user, 
			BindingResult result) {
		if(result.hasErrors()) {
			return "newUser.jsp";
		}else {
			mainService.createUser(user);
			return "redirect:/";
		}
	}
	
	
	// create donations
	// 1. show the form
	@GetMapping("/donations/new")
	public String showDonationForm(Model model) {
		model.addAttribute("newDonation", new Donation());
		model.addAttribute("userList", mainService.allUsers());
		return "newDonation.jsp";
	}
	// 2. process the form
	@PostMapping("/donations/process")
	public String processDonationForm(
			@Valid @ModelAttribute("newDonation")Donation donation,
			BindingResult result, Model model) {
		if(result.hasErrors()) {
			model.addAttribute("userList", mainService.allUsers());
			return "newDonation.jsp";
		}else {
			mainService.createDonation(donation);
			return "redirect:/";
		}
	}
	
	
	
	
	
}





















