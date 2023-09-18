package com.luv2code.springboot.core.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luv2code.springboot.core.common.Coach;

@RestController
public class DemoController {

	private Coach myCoach;

	// if u have only one bean to inject then no need to use @autowired
	@Autowired
	public DemoController(Coach myCoach) {
		this.myCoach = myCoach;
	}

	@GetMapping("/dailyWorkout")
	public String getdailyWorkOut() {
		return myCoach.getDailyWorkOut();
	}

}
