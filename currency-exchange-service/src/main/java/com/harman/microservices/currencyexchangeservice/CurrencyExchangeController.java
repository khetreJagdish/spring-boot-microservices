package com.harman.microservices.currencyexchangeservice;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	
	@Autowired
	private CurrencyExchangeRepository repository;
	
	@Autowired
	private Environment environment;
		
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public CurrencyExchange retrieveExchangeValue(
			@PathVariable String from,
			@PathVariable String to) {
		
		//CurrencyExchange currencyExchange = new CurrencyExchange(1000L, from, to, BigDecimal.valueOf(50));
		String port = environment.getProperty("local.server.port");
		CurrencyExchange currencyExchange = repository.findByFromAndTo(from, to);
		if(null == currencyExchange) {
			throw new RuntimeException("Unable to find the data for "+ from +" to "+ to);
		}
		currencyExchange.setEnvironment(port);
		
		
		return currencyExchange;
	}
}
