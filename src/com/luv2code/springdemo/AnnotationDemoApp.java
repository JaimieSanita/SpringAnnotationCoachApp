package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		//read spring configuration file
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");	
		//get the bean from spring container //bean id	//interface
		Coach theCoach = context.getBean("swimmingCoach", Coach.class);
		
		//call methods on bean
		System.out.println(theCoach.getDailyWorkout());
		//call method to get daily fortune; dependency
		System.out.println(theCoach.getDailyFortune());
		//close the context
		context.close();

	}

}
