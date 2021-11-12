package com.example.serviciomatricula.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.serviciomatricula.entidad.Curso;
import com.example.serviciomatricula.service.ICursoService;

@RestController
@RequestMapping("/curso")
public class CursoController {
	
	@Autowired
	private ICursoService service;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Curso>> listarCurso(){
		return new ResponseEntity<List<Curso>>(service.listarCursos(), HttpStatus.OK);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<?> grabarCurso(@RequestBody Curso curso){
		service.crearCurso(curso);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
		
	}

}
