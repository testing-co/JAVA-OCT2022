package com.heidichen.mvcdemo.controllers;

import java.util.List;

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
import org.springframework.web.bind.annotation.RequestParam;

import com.heidichen.mvcdemo.models.Donation;
import com.heidichen.mvcdemo.services.DonationService;

@Controller
public class HomeController {

	@Autowired
	private DonationService donationService;
	
	// -------- DASHBAORD -----------
	@GetMapping("/donations")
	public String dashboard(Model model) {
		List<Donation> allDonations = donationService.allDonations();
		model.addAttribute("donationList", allDonations);
		return "dashboard.jsp";
	}
	
	
	// -------- DETAILS -----------
	@GetMapping("/donations/{id}")
	public String oneDonation(@PathVariable("id") Long id, Model model) {
		Donation foundDonation = donationService.oneDonaiton(id);
		model.addAttribute("donation", foundDonation);
		return "donationDetails.jsp";
	}
	
	
	// -------- CREATE (DataBinding!) -----------
	// 1. show form
	@GetMapping("/donations/new")
	public String showCreateFormInModelAttribute(Model model ) {
		// @ModelAttribute --> create the new Donation for us
		Donation emptyDonation = new Donation();
		model.addAttribute("newDonation", emptyDonation);
		return "createDonationBinding.jsp";
	}
	
	// 2. process form
	@PostMapping("/donations/new")
	public String processBindingCreateDonation(
			@Valid @ModelAttribute("newDonation") Donation donation, 
			BindingResult result
			) {
		if(result.hasErrors()) {
			return "createDonationBinding.jsp";
		}else {
			donationService.createDonation(donation);
			return "redirect:/donations";
		}
	}
	
	// -------- EDIT -----------	
	// 1. show form - get details from service, put it in the model
	@GetMapping("/donations/edit/{id}")
	public String showEditForm(@PathVariable("id") Long id, Model model) {
		Donation foundDonation = donationService.oneDonaiton(id);
		model.addAttribute("donation", foundDonation);
		return "editDonation.jsp";
	}
	
	// 2. process form
	@PutMapping("/donations/edit/{id}")
	public String processEditForm(
			@Valid @ModelAttribute("donation")Donation donation, BindingResult result) {
		if(result.hasErrors()) {
			return "editDonation.jsp";
		}else {
			donationService.editDonation(donation);
			return "redirect:/donations";
		}
	}
	
	
	// -------- DELETE -----------	
	@DeleteMapping("/donations/delete/{id}")
	public String processDelete(@PathVariable("id")Long id) {
		donationService.deleteDonation(id);
		return "redirect:/donations";
	}
	
	// -------- CREATE (RequestParam, won't use much)-----------
	// 1. show the form
	@GetMapping("/donations/new2")
	public String showCreateForm() {
		return "createDonation.jsp";
	}
	
	// 2. process the form
	@PostMapping("/donations/create/process")
	public String processCreateDonation(
			@RequestParam("itemName") String itemName,
			@RequestParam("quantity") Integer quantity,
			@RequestParam("donor") String donor) {
		Donation newDonation = new Donation(itemName, quantity, donor);
		donationService.createDonation(newDonation);
		return "redirect:/donations";
	}
	

	
}









