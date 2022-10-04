package com.heidichen.mvcdemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.heidichen.mvcdemo.models.Donation;
import com.heidichen.mvcdemo.services.DonationService;

@RestController
@RequestMapping("/api")
public class APIController {

	@Autowired
	private DonationService donationService;
	
	// find all
	@GetMapping("/donations")
	public List<Donation> renderDonations(){
		return donationService.allDonations();
	}
	
	// create process
	@PostMapping("/donations")
	public Donation createDonationProcess(
			@RequestParam("itemName") String itemName,
			@RequestParam("quantity") Integer quantity,
			@RequestParam("donor") String donor
			) {
		Donation newDonation = new Donation(itemName, quantity, donor);
		return donationService.createDonation(newDonation);
	}
	
	// find one
	@GetMapping("/donations/{id}")
	public Donation renderOneDonation(@PathVariable("id") Long id) {
		return donationService.oneDonaiton(id);
	}
	
	
	// edit -- findOne + create
	@PutMapping("/donations/{id}")
	public Donation editDonationProcess(@PathVariable("id") Long id,
			@RequestParam("itemName") String itemName,
			@RequestParam("quantity") Integer quantity,
			@RequestParam("donor") String donor) {
		Donation foundDonation = donationService.oneDonaiton(id);
		foundDonation.setItemName(itemName);
		foundDonation.setQuantity(quantity);
		foundDonation.setDonor(donor);
		return donationService.editDonation(foundDonation);
	}
	
	// delete
	@DeleteMapping("/donations/{id}")
	public void deleteDonationProcess(@PathVariable("id")Long id) {
		donationService.deleteDonation(id);
	}
	
	
}





