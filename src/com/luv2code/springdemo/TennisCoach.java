package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	//Spring constructs  class by calling constructor
	//Spring inject fortuneService into class using Java Reflection
	
	
	//define default, no-arg constructor
	public TennisCoach() {
		System.out.println(">>Tennis Coach: inside default constructor");
	}
	
	/*
	@Autowired
	public void doSomeCrazyStuff(FortuneService theFortuneService) {
		System.out.println(">>Tennis Coach: inside doSomeCrazyStuff method.");
		fortuneService = theFortuneService;
	}
	
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
