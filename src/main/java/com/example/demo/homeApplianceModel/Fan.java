package com.example.demo.homeApplianceModel;

import com.example.demo.homeApplianceService.HomeApplliance;

public class Fan implements HomeApplliance{

	private  int speed = 1; 
	
	@Override
	public void turnOff() {
		speed =0; // means off
		
	}

	@Override
	public boolean isOn() {
		return speed >0;
	}

}
