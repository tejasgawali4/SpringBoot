package com.example;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyService {

	@RequestMapping(value = "/Hello", method = RequestMethod.GET)
	public String hello()
	{
		return "Hello";
	}
	
}
