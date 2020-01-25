package com.example.testservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestServiceController {
	@RequestMapping("/test")
	public String testMethod() {
		return "Test successful---";
		
	}
}
