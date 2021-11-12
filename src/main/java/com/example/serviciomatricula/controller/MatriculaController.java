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

import com.example.serviciomatricula.entidad.Matricula;
import com.example.serviciomatricula.service.IMatriculaService;



@RestController
@RequestMapping("/matricula")
public class MatriculaController {
	
	@Autowired
	private IMatriculaService service;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Matricula>> listarMatriculas(){
		return new ResponseEntity<List<Matricula>>(service.listarMatricula(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public @ResponseBody ResponseEntity<Matricula> listarPorId(@PathVariable Integer id){
		Matricula e = service.listarPorId(id);
		if(e != null) {
			return new ResponseEntity<Matricula>(e,HttpStatus.OK);
		}
		
		return new ResponseEntity<Matricula>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<Void> crearMatricula(@RequestBody Matricula matricula){
		service.crearMatricula(matricula);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

}
