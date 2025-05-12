package com.example.demo.homeApplianceModel;

import com.example.demo.homeApplianceService.HomeApplliance;

public class AirConditioner  implements HomeApplliance{

	private String mode ="OFF";
			
	@Override
	public void turnOff() {
		mode = "OFF";
		
	}

	@Override
	public boolean isOn() {		
		return !"OFF".equalsIgnoreCase(mode);
	}

}
