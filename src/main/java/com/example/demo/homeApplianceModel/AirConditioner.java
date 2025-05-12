package com.example.demo.homeApplianceModel;

import org.springframework.stereotype.Component;

import com.example.demo.homeApplianceService.HomeApplliance;

@Component
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
