package com.example.serviciomatricula.service;

import java.util.List;

import com.example.serviciomatricula.entidad.Estudiante;

public interface IEstudianteService {
	
	List<Estudiante> listarEstudiante();
	Estudiante listarPorId(Integer id);
	void crearEstudiante(Estudiante matricula);

}
