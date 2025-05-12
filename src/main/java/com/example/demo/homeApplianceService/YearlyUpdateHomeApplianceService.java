package com.example.demo.homeApplianceService;

import org.springframework.stereotype.Service;

@Service
public class YearlyUpdateHomeApplianceService {

	private HomeApplianceService homeApplinaceService;

	public YearlyUpdateHomeApplianceService(HomeApplianceService homeApplinaceService) {
		super();
		this.homeApplinaceService = homeApplinaceService;
	}
	
	
	public void performYearlyUpdate() {
		homeApplinaceService.turnOffAll();		
	}
	
}
