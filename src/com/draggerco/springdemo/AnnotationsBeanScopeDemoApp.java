package com.draggerco.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach theCoach = context.getBean("tennisCoach", Coach.class);
		Coach theCoach2 = context.getBean("tennisCoach", Coach.class);

		boolean equals = theCoach == theCoach2;

		System.out.println("Pointing to the same point?" + equals);
		System.out.println("Location for the couch" + theCoach);
		System.out.println("Location for the couch2" + theCoach2);

		context.close();
	}

}
