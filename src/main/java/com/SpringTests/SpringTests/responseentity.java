package com.SpringTests.SpringTests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class responseentity {
	
	@RequestMapping("/teste")
	public ResponseEntity<String> somadois(@RequestHeader("numero") int num, @RequestHeader("numero2") int num2){
		String resposta = String.format("%d + %d = %d", num, num2, num + num2);
		return new ResponseEntity<String>(resposta, HttpStatus.BAD_REQUEST);
	}
	
	public static void main(String[] args) {
		SpringApplication.run(responseentity.class, args);
	}
}