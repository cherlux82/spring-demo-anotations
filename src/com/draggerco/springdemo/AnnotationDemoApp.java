package com.draggerco.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		SwingCoach tennisCoach = context.getBean("swingCoach", SwingCoach.class);

		System.out.println(tennisCoach.getDailyWorkout());

		System.out.println(tennisCoach.getFortune());

		context.close();

	}

}
