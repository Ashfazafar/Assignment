package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.homeApplianceService.HomeApplianceService;
import com.example.demo.homeApplianceService.HomeApplliance;
import com.example.demo.homeApplianceService.YearlyUpdateHomeApplianceService;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping("/appliances")
public class HomeApplianceController {
	
	private HomeApplianceService homeApplianceService;
	private YearlyUpdateHomeApplianceService yearlyUpdateService;

	public HomeApplianceController(HomeApplianceService homeApplianceService, YearlyUpdateHomeApplianceService yearlyUpdateService) {
		super();
		this.homeApplianceService = homeApplianceService;
		this.yearlyUpdateService = yearlyUpdateService;
	}
	
	@GetMapping("All")
	 public List<HomeApplliance> getAppliances(){
		 return homeApplianceService.getAppliances();
	}

	@PostMapping("/applianceType")
	public ResponseEntity<String> turnOff(@RequestParam String applianceType){
		homeApplianceService.turnOffIndividualAppliance(applianceType);
		return ResponseEntity.ok(applianceType + "gets turned off");
		
	}
	
	@PostMapping("/shutdown")
	public ResponseEntity<String> shutdown(){
		yearlyUpdateService.performYearlyUpdate();
		return ResponseEntity.ok("All appliances are automatically shutdown");
		
	}
}
