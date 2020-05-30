package com.pluralsight.conferencespringmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pluralsight.conferencespringmvc.model.User;

@RestController
public class UserController {
	
	@GetMapping("/user")
	public User getUser(@RequestParam(value = "firstName", defaultValue = "Shrawan") String firstName,
			@RequestParam(value = "lastName", defaultValue = "Keshari") String lastName,
			@RequestParam(value = "age", defaultValue = "26") int age) {
		User user = new User();
		
		user.setFirstName(firstName);
		user.setLastName(lastName);
		user.setAge(age);
		
		return user;
	}
	
	@PostMapping("/user")
	public User postUser(User user) {
		
		System.out.println("User FirstName: " + user.getFirstName());
		
		return user;
	}
}
