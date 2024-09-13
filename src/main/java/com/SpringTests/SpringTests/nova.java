package com.SpringTests.SpringTests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class nova {
	
	@RequestMapping("/nova")
	public ResponseEntity<String> aqui(@RequestHeader(HttpHeaders.ACCEPT_LANGUAGE) String linguagem ){
		System.out.println(linguagem);
		return new ResponseEntity<String>("", HttpStatus.OK);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(nova.class, args);
	}

}
