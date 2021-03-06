package com.draggerco.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("karate")
public class KarateCouch implements Coach {

	private FortuneService fortuneService;

	@Autowired
	public KarateCouch(@Qualifier("randomService") FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "Break some blocks with your head";
	}

	@Override
	public String getFortune() {
		return fortuneService.getFortune();
	}

}
