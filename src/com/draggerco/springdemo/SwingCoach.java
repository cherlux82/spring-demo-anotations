package com.draggerco.springdemo;

import org.springframework.stereotype.Component;

@Component
public class SwingCoach implements Coach {

	FortuneService fortuneService;

	@Override
	public String getDailyWorkout() {
		return "Nadar 1 km de mariposa";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

	public SwingCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
}
