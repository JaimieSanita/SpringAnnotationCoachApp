package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SwimmingCoach implements Coach {

	@Override
	public String getDailyWorkout() {
		
		return "Practice the backstroke for 20 minutes";
	}

	@Override
	public String getDailyFortune() {
		// TODO Auto-generated method stub
		return null;
	}

}
