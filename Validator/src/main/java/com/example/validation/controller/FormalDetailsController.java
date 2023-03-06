package com.example.validation.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.validation.entity.FormalDetails;
import com.example.validation.service.FormalDetailsService;


@RestController
@RequestMapping
public class FormalDetailsController {
	
	@Autowired
	FormalDetailsService formalDetailsService;
	
	@PostMapping("/create")
	public ResponseEntity<FormalDetails> create(@Valid @RequestBody FormalDetails formalDetails){
		FormalDetails detailsList = formalDetailsService.createFormalDetails(formalDetails);
			return new ResponseEntity<FormalDetails>(detailsList, HttpStatus.CREATED);
			
	}

}
