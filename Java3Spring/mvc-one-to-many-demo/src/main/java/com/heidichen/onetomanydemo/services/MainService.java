package com.heidichen.onetomanydemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.heidichen.onetomanydemo.models.Donation;
import com.heidichen.onetomanydemo.models.User;
import com.heidichen.onetomanydemo.repositories.DonationRepository;
import com.heidichen.onetomanydemo.repositories.UserRepository;

@Service
public class MainService {

	@Autowired
	private DonationRepository donationRepo;
	
	@Autowired
	private UserRepository userRepo;
	
	// find all donations
	public List<Donation> allDonations(){
		return donationRepo.findAll();
	}
	
	// find all users
	public List<User> allUsers(){
		return userRepo.findAll();
	}
	
	// create donations
	public Donation createDonation(Donation donation) {
		return donationRepo.save(donation);
	}
	
	// create users
	public User createUser(User user) {
		return userRepo.save(user);
	}
	
	// find one user
	public User oneUser(Long userId) {
		Optional<User> optionalUser = userRepo.findById(userId);
		if(optionalUser.isPresent()) { // if true, user exists
			return optionalUser.get();
		}else {
			return null;
		}
	}
	
	// find one donation
	public Donation oneDonation(Long donationId) {
		Optional<Donation> optionalDonation = donationRepo.findById(donationId);
		if(optionalDonation.isPresent()) {
			return optionalDonation.get();
		}else {
			return null;
		}
	}
	
	// edit donation
	public Donation editDonation(Donation donation) {
		return donationRepo.save(donation);
	}
	
	// delete donation
	public void deleteDonation(Long donationId) {
		donationRepo.deleteById(donationId);
	}
	
}
