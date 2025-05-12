package com.example.demo.homeApplianceModel;

import org.springframework.stereotype.Component;

import com.example.demo.homeApplianceService.HomeApplliance;

@Component
public class Light implements HomeApplliance {

	private boolean switchOn = true;
	
	@Override
	public void turnOff() {
		switchOn = false;
		
	}

	@Override
	public boolean isOn() {		
		return switchOn;
	}

}
