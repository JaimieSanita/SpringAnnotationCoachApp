package com.luv2code.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	//create an array of strings
	private String[] data = {"Beware of the worf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"};
	
	//create a random number generator
	private Random myRandom = new Random();

	@Override
	public String getFortune() {
		//pick random string fortune from array
		int index = myRandom.nextInt(data.length);
		String fortune = data[index];
		return fortune;
	}

}
