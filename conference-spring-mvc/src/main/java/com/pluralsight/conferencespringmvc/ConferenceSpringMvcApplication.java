package com.pluralsight.conferencespringmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ConferenceSpringMvcApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ConferenceSpringMvcApplication.class, args);
	}

}
