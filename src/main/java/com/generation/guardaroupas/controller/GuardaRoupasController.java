package com.generation.guardaroupas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.generation.guardaroupas.model.GuardaRoupa;
import com.generation.guardaroupas.repository.GuardaRoupasRepository;

@RestController //Informar que a classe é um controlador
@RequestMapping("/roupas") //Define uma URI pricipal
@CrossOrigin(value = "*", allowedHeaders = "*") // Liberando qualquer origem e qualquer heades
public class GuardaRoupasController {

	@Autowired
	private GuardaRoupasRepository repository;
	
	@GetMapping
	public ResponseEntity<List<GuardaRoupa>> getAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<GuardaRoupa> getById(@PathVariable long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.badRequest().build());
	}
	
	
}
