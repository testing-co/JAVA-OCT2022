package com.heidichen.onetomanydemo.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

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
	
	
	// get one user
	@GetMapping("/users/{id}")
	public String userDetails(@PathVariable("id") Long id, Model model) {
		User foundUser = mainService.oneUser(id);
		model.addAttribute("user", foundUser);
		return "oneUser.jsp";
	}
	
	// get one donation
	@GetMapping("/donations/{id}")
	public String donationDetails(@PathVariable("id") Long id, Model model) {
		model.addAttribute("donation", mainService.oneDonation(id));
		return "oneDonation.jsp";
	}
	
	// EDIT donation without changing the donor
	@GetMapping("/donations/edit/{id}")
	public String editDonation(@PathVariable("id") Long id, Model model) {
		model.addAttribute("donation", mainService.oneDonation(id));
		return "editDonation.jsp";
	}
	
	@PutMapping("/donations/edit/{id}")
	public String editDonationProcess(
			@Valid @ModelAttribute("donation")Donation donation,
			BindingResult result
			) {
		if(result.hasErrors()) {
			return "editDonation.jsp";
		}else {
			mainService.editDonation(donation);
			return "redirect:/";
		}
	}
	
	@DeleteMapping("/donations/delete/{id}")
	public String deleteDonationProcess(@PathVariable("id")Long id) {
		mainService.deleteDonation(id);
		return "redirect:/";
	}
	
	
	
}





















