package com.heidichen.mvcdemo.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.heidichen.mvcdemo.models.Donation;

@Repository
public interface DonationRepository extends CrudRepository<Donation, Long>{ // save, findById
	
	List<Donation> findAll();
 
}

