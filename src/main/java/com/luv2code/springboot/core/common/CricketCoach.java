package com.luv2code.springboot.core.common;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach {

	@Override
	public String getDailyWorkOut() {
		return "Practive fast bowling for 15 min!!!";
	}

}
