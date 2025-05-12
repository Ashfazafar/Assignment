package com.example.demo.homeApplianceService;

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
