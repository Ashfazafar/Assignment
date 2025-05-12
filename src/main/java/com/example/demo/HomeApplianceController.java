package com.example.demo;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.homeApplianceService.HomeApplianceService;
import com.example.demo.homeApplianceService.HomeApplliance;
import com.example.demo.homeApplianceService.YearlyUpdateHomeApplianceService;


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

	@PostMapping("/device/{type}")
	public ResponseEntity<String> turnOff(@PathVariable("type") String applianceType){
		
		 if (applianceType == null || !(applianceType.equalsIgnoreCase("Light") 
				 || applianceType.equalsIgnoreCase("Fan") 
				 || applianceType.equalsIgnoreCase("AirConditioner"))) {
			 return ResponseEntity.notFound().build();
		 }
		homeApplianceService.turnOffIndividualAppliance(applianceType);
		return ResponseEntity.ok(applianceType + "gets turned off");
		
	}
	
	@PostMapping("/shutdown")
	public ResponseEntity<String> shutdown(){
		yearlyUpdateService.performYearlyUpdate();
		return ResponseEntity.ok("All appliances are automatically shutdown");
		
	}
}
