package com.example.serviciomatricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.serviciomatricula.entidad.Estudiante;

public interface IEstudianteRepositorio extends JpaRepository<Estudiante, Integer>{

}
