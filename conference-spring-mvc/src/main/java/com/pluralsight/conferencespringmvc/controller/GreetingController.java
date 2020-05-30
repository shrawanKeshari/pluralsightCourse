package com.pluralsight.conferencespringmvc.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GreetingController {
	
	@GetMapping("greeting")
	public String geeting (Map<String, Object> model) {
		model.put("message", "Hello Shrawan");
		return "greeting";
	}
	
}
