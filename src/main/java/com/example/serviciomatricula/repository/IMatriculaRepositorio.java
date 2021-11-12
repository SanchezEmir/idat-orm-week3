package com.example.serviciomatricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.serviciomatricula.entidad.Matricula;

public interface IMatriculaRepositorio extends JpaRepository<Matricula, Integer>{

}
