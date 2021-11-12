package com.example.serviciomatricula.service;

import java.util.List;

import com.example.serviciomatricula.entidad.Curso;

public interface ICursoService {
	
	List<Curso> listarCursos();
	Curso listarPorId(Integer id);
	void crearCurso(Curso curso);
	void actualizarCurso(Curso curso);
	void eliminarCurso(Integer id);

}
