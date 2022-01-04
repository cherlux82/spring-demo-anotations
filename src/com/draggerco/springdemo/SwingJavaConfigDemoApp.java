package com.draggerco.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SwingJavaConfigDemoApp {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SportConfig.class);
		SwingCoach tennisCoach = context.getBean("swingCoach", SwingCoach.class);

		System.out.println(tennisCoach.getDailyWorkout());

		System.out.println(tennisCoach.getFortune());

		context.close();

	}

}
