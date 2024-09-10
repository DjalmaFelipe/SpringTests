package com.SpringTests.SpringTests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class pathvariable {
	
	// pathvariable é usado quando o valor faz parte da rota
	
	@RequestMapping("/{test}")
	public String pathVariable(@PathVariable String test) {
		return "este é o valor adicionado a URL" + test;
	}
	

	public static void main(String[] args) {
		SpringApplication.run(pathvariable.class, args);
	}

}
