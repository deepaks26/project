package com.exchange;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CurrencyExchangeController {
	@Autowired
	private Environment environment;

	@Autowired
	private ExchangeValueRepository repo;

	@GetMapping("/currency-exchange/from/{from}/to/{to}") // where {from} and {to} are path variable
	public ExchangeValue retrieveExchangeValue(@PathVariable String from, @PathVariable String to) // from map to USD
																									// and to map to INR
	{
		ExchangeValue ex = repo.findByFromAndTo(from, to); //new ExchangeValue(1000L, from, to, BigDecimal.valueOf(65));
		ex.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		return ex;

	}
}
