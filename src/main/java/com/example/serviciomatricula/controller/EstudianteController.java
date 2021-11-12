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

import com.example.serviciomatricula.entidad.Estudiante;
import com.example.serviciomatricula.service.IEstudianteService;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {
	
	@Autowired
	private IEstudianteService service;
	
	@GetMapping("/listar")
	public ResponseEntity<List<Estudiante>> listarEstudiantes(){
		return new ResponseEntity<List<Estudiante>>(service.listarEstudiante(),HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public @ResponseBody ResponseEntity<Estudiante> listarPorId(@PathVariable Integer id){
		Estudiante e = service.listarPorId(id);
		if(e != null) {
			return new ResponseEntity<Estudiante>(e,HttpStatus.OK);
		}
		
		return new ResponseEntity<Estudiante>(HttpStatus.NOT_FOUND);
	}
	
	@PostMapping("/crear")
	public ResponseEntity<Void> crearEstudiante(@RequestBody Estudiante estudiante){
		service.crearEstudiante(estudiante);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}

}
