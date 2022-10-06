package com.heidichen.onetomanydemo.services;

import java.util.List;

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
	
	
	
}
