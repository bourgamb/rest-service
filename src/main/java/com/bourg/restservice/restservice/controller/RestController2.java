package com.bourg.restservice.restservice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/v1")
public class RestController2 {

	@GetMapping("/hello")
	public String myTest() {
		return "Hello there";
	}
	
}
