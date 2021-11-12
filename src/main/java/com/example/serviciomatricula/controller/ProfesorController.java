package com.example.serviciomatricula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.serviciomatricula.entidad.Profesor;
import com.example.serviciomatricula.service.IProfesorService;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {
	
	@Autowired
	private IProfesorService service;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Profesor>> listarProfesores(){
		return new ResponseEntity<List<Profesor>>(service.listarProfesor(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public @ResponseBody ResponseEntity<Profesor> listarPorId(@PathVariable Integer id){
		Profesor e = service.listarPorId(id);
		if(e != null) {
			return new ResponseEntity<Profesor>(e,HttpStatus.OK);
		}
		
		return new ResponseEntity<Profesor>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<Void> crearProfesor(@RequestBody Profesor profesor){
		service.crearProfesor(profesor);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

}
