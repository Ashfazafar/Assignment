package com.example.demo.homeApplianceService;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.homeApplianceModel.AirConditioner;
import com.example.demo.homeApplianceModel.Fan;
import com.example.demo.homeApplianceModel.Light;

@Service
public class HomeApplianceService {

	private List<HomeApplliance> appliances;
	
	public HomeApplianceService() {		
		this.appliances = List.of(new Fan(), new Light(), new AirConditioner());
	}
	
	public void turnOffAll() {
		
		appliances.forEach(HomeApplliance::turnOff);
	}
	
	
	public void turnOffIndividualAppliance(String applianceType) {

		if ("Light".equalsIgnoreCase(applianceType)) {
			new Light().turnOff();
		}else if ("AirConditioner".equalsIgnoreCase(applianceType)) {
			new AirConditioner().turnOff();
		}else if("Fan".equalsIgnoreCase(applianceType)) {
			new Fan().turnOff();
		} else {			
			System.out.println("Not valid option");
		}
	}

	public List<HomeApplliance> getAppliances(){
		
		return appliances;
		
	}
}
