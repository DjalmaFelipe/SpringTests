package com.SpringTests.SpringTests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class requestmapping {
	
	@RequestMapping("/")
	public String HelloWorld() {
		return "Olá Mundo";
	}
	

	public static void main(String[] args) {
		SpringApplication.run(requestmapping.class, args);
	}

}
