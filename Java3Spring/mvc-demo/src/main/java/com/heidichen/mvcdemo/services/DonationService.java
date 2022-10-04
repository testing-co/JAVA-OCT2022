package com.heidichen.mvcdemo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.heidichen.mvcdemo.models.Donation;
import com.heidichen.mvcdemo.repositories.DonationRepository;

@Service
public class DonationService {

	// option 1
	private final DonationRepository donationRepo;

	
	public DonationService(DonationRepository donationRepo) {
		this.donationRepo = donationRepo;
	}
	
	// option 2
//	@Autowired
//	private DonationRepository donationRepo;
	
	
	// save info to database
	public Donation createDonation(Donation newDonation) {
		return donationRepo.save(newDonation);
	}
	
	// find all (select * from donations)
	public List<Donation> allDonations(){
		return donationRepo.findAll();
	}
	
	
	// find one
	public Donation oneDonaiton(Long id) {
		Optional<Donation> optionalDonation = donationRepo.findById(id);
		if(optionalDonation.isPresent()) {
			return optionalDonation.get();
		}else {
			return null;
		}
	}
	
	// edit
	public Donation editDonation(Donation updatedDonation) {
		return donationRepo.save(updatedDonation);
	}
	
	// delete
	public void deleteDonation(Long id) {
		donationRepo.deleteById(id);
	}
	
	
	
}
