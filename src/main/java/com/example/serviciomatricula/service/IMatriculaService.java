package com.example.serviciomatricula.service;

import java.util.List;

import com.example.serviciomatricula.entidad.Matricula;

public interface IMatriculaService {
	
	List<Matricula> listarMatricula();
	Matricula listarPorId(Integer id);
	void crearMatricula(Matricula matricula);

}
