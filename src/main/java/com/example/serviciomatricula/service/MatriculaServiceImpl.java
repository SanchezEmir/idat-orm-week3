package com.example.serviciomatricula.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.serviciomatricula.entidad.Matricula;
import com.example.serviciomatricula.repository.IMatriculaRepositorio;

@Service
public class MatriculaServiceImpl implements IMatriculaService{
	
	@Autowired
	private IMatriculaRepositorio repo;

	@Override
	public List<Matricula> listarMatricula() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Matricula listarPorId(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void crearMatricula(Matricula matricula) {
		// TODO Auto-generated method stub
		repo.save(matricula);
	}

}
