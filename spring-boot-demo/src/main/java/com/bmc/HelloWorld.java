package com.bmc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@Autowired
	@Qualifier("RegularWriter")
	TextWriter  textWriter;
	
	
	@GetMapping("/hello")
	public String printText() {
		return textWriter.writeText("Hi! Jagdish");
	}
	
	
	
}
