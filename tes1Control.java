package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class tes1Control {
	
	@GetMapping("/student")
	public String hello()
	{
		return "Hello World!";
	}
}
