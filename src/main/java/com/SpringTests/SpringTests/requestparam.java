package com.SpringTests.SpringTests;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
public class requestparam {
	
	/* 
	   requestparam é usado quando há uma consulta na URL 
	   usando chave e valor.
	   exemplo de URL: localhost:8080/nomes?name=felipe
	*/
	
	@RequestMapping("/nomes")
	public String requestParam(@RequestParam("name") String nome) {
		return "nome: " + nome;
	}

	public static void main(String[] args) {
		SpringApplication.run(requestparam.class, args);
	}

}
