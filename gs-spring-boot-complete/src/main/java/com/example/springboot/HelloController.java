package com.example.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot! from index";
	}
	
	
	@GetMapping("/admin")
	public String admin() {
		return "Greetings from Spring Boot! from admin";
	}
	
	
	@GetMapping("/user")
	public String user() {
		return "Greetings from Spring Boot! user";
	}

}
