package com.SpringTests.SpringTests;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.SpringTests.SpringTests.service.model.Pessoa;



@RestController
@SpringBootApplication
@RequestMapping("/Pessoa")
public class Postmapping {
	
	public List<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	@PostMapping
	public ResponseEntity<Pessoa> adicionarPessoa(@RequestBody Pessoa newpessoa){
		pessoas.add(newpessoa);
		
		return new ResponseEntity<Pessoa>(newpessoa, HttpStatus.CREATED);
	}

	public static void main(String[] args) {
		SpringApplication.run(Postmapping.class, args);
	}
	
	
	
	

}
