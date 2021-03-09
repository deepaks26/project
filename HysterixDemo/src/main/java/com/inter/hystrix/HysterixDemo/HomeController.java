package com.inter.hystrix.HysterixDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HomeController {
	
	@GetMapping(value = "/int")
	@HystrixCommand(fallbackMethod =  "fallback")
	public String getInt() {
		//int i = 1/0;
		return "hello";
	}
	
	public String fallback() {
		return "world";
	}
	
	
}
