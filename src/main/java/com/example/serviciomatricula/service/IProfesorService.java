package com.example.serviciomatricula.service;

import java.util.List;

import com.example.serviciomatricula.entidad.Profesor;

public interface IProfesorService {
	
	List<Profesor> listarProfesor();
	Profesor listarPorId(Integer id);
	void crearProfesor(Profesor profesor);

}
