package com.draggerco.springdemo;

import org.springframework.stereotype.Component;

@Component
public class KarateCouch implements Coach {

	@Override
	public String getDailyWorkout() {
		return "Break some blocks with your head";
	}

}
