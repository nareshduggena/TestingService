package com.sample.employeeservice.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	@RequestMapping(method = RequestMethod.GET,value = "/getEmployees")
	public void getEmployees() {
		
		
	}
	
	
	@RequestMapping("/test")
	public String testMethod() {
		return "Test successful";
		
	}
}
