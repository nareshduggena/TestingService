package com.example.testhealthservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestHealthController {

	@RequestMapping("/apphealth")
	public String testAppHealth() {
		String response = "Application is up and running updated----!!";
		System.out.println(response);
		return response;
		
	}
}
