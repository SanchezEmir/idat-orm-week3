package com.example.serviciomatricula.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.serviciomatricula.entidad.Profesor;
import com.example.serviciomatricula.repository.IProfesorRepositorio;

@Service
public class ProfesorServiceImpl implements IProfesorService{
	
	@Autowired
	private IProfesorRepositorio repo;

	@Override
	public List<Profesor> listarProfesor() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Profesor listarPorId(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void crearProfesor(Profesor profesor) {
		// TODO Auto-generated method stub
		repo.save(profesor);
	}

}
