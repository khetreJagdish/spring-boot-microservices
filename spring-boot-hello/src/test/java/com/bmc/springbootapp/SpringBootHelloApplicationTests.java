package com.bmc.springbootapp;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(classes = SpringBootHelloApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SpringBootHelloApplicationTests {
	
	@Autowired
	private TestRestTemplate restTemplate; 
	
	@Test
	public void contextLoads() {
		ResponseEntity<String> response = restTemplate.getForEntity("/", String.class);
		assertThat(response.getBody()).isEqualTo("Hello World Spring Boot!");
		
		
	}

}
