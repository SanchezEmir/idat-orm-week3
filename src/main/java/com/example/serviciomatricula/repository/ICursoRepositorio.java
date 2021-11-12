package com.example.serviciomatricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.serviciomatricula.entidad.Curso;

public interface ICursoRepositorio extends JpaRepository<Curso, Integer>{

}
