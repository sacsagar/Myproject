package com.zensar.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping
	//@RequestMapping(value = "/",method=RequestMethod.GET)
	public String sayHello() {
		return "<h1>Hi Welcome to Docker</h1>";
	}

}
