package com.example.serviciomatricula.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.serviciomatricula.entidad.Estudiante;
import com.example.serviciomatricula.repository.IEstudianteRepositorio;

@Service
public class EstudianteServiceImpl implements IEstudianteService{
	
	@Autowired
	private IEstudianteRepositorio repo;

	@Override
	public List<Estudiante> listarEstudiante() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Estudiante listarPorId(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).orElse(null);
	}

	@Override
	public void crearEstudiante(Estudiante matricula) {
		// TODO Auto-generated method stub
		repo.save(matricula);
	}

}
