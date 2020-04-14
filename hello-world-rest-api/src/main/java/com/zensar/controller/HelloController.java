package com.zensar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.entity.Employee;

@RestController
public class HelloController {

	@GetMapping
	// @RequestMapping(value = "/",method=RequestMethod.GET)
	public String sayHello() {
		return "<h1>Hi Welcome to Docker</h1>";
	}

	@GetMapping("/employee")
	public Employee getEmployee() {
		return new Employee(1001, "Ram", 10000);
	}

}
