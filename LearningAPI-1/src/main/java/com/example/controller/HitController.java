package com.example.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.example.entity.HitsTotal;
import com.example.entity.HitsTotal2;

@Controller
public class HitController {
	
	@GetMapping("/demo")
	public List<HitsTotal> total(@ModelAttribute HitsTotal hitsTotal){
		
		List<HitsTotal>hitsTotals = new ArrayList<>();
		hitsTotal.setTotal(1);
		hitsTotal.setMax(10.0000);
		hitsTotals.add(hitsTotal);
		return hitsTotals;
		
	}

}
