package com.example.gitactions;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GitactionsApplication {

	@GetMapping("/saludo")
	public String saludar() {
		return "Hola Mundo - 2026! " ;
	}
	@GetMapping("/despedida")
	public String despedida() {
		return "Adios Mundo - 2026! " ;
	}

	public static void main(String[] args) {
		SpringApplication.run(GitactionsApplication.class, args);
	}

}
