package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class HomeApplianceDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeApplianceDemoApplication.class, args);
	}

}
