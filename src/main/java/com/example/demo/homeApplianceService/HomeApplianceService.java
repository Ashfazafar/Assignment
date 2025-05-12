package com.example.demo.homeApplianceService;

import java.util.List;

import com.example.demo.homeApplianceModel.AirConditioner;
import com.example.demo.homeApplianceModel.Fan;
import com.example.demo.homeApplianceModel.Light;

public class HomeApplianceService {

	private List<HomeApplliance> appliances;
	
	public HomeApplianceService() {		
		this.appliances = List.of(new Fan(), new Light(), new AirConditioner());
	}
	
	public void turnOffAll() {
		
		appliances.forEach(HomeApplliance::turnOff);
	}
	
	public List<HomeApplliance> getAppliances(){
		
		return appliances;
		
	}
}
