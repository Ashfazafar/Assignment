package com.example.demo.homeApplianceModel;

import com.example.demo.homeApplianceService.HomeApplliance;

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
