package com.example.validation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.validation.entity.FormalDetails;
import com.example.validation.repository.FormalDetailsRepository;

@Service
public class FormalDetailsService {

	@Autowired
	FormalDetailsRepository formaldetailsRepository;
	
	public FormalDetails createFormalDetails(FormalDetails formalDetails) {
		return formaldetailsRepository.save(formalDetails);
	}
}
