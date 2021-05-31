package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	//define default, no-arg constructor
	public TennisCoach() {
		System.out.println(">>Tennis Coach: inside default constructor");
	}
	
	//define setter method
	@Autowired
	public void setFortuneService(FortuneService theFortuneService) {
		System.out.println(">>Tennis Coach: inside setter method.");
		fortuneService = theFortuneService;
	}
	
	/*
	@Autowired //spring will scan for component that implements fortuneService interface ex. happyFortuneService 
	public TennisCoach(FortuneService theFortuneService) {
		fortuneService = theFortuneService;
	}
	*/

	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

	

}
