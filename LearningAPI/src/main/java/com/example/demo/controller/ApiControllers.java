package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.demo.model.Message;

@Controller
public class ApiControllers {
	
	@GetMapping("/message")
	public List<Message> message(@ModelAttribute Message mess) {
		
		List<Message>message = new ArrayList<Message>();
		message.addAll(message);
		return message;
		
		
	}

}
