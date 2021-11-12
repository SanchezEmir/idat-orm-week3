package com.example.serviciomatricula.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.serviciomatricula.entidad.Curso;
import com.example.serviciomatricula.repository.ICursoRepositorio;

@Service
public class CursoServiceImpl implements ICursoService{
	
	@Autowired
	private ICursoRepositorio repo;

	@Override
	public List<Curso> listarCursos() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Curso listarPorId(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void crearCurso(Curso curso) {
		// TODO Auto-generated method stub
		repo.save(curso);
	}

	@Override
	public void actualizarCurso(Curso curso) {
		// TODO Auto-generated method stub
		repo.saveAndFlush(curso);
	}

	@Override
	public void eliminarCurso(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}

}
