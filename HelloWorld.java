package com.generation.blogpessoal.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorld 
{
	@GetMapping
	public String hello()
	{
		return "Habilidades: Trabalho em equipe, Atenção aos detalhes, Proatividade, Comunicação; Mentalidades: Orientação ao futuro, Responsabilidade pessoal,  mentalidade de crescimento, persistencia";
	}
}
