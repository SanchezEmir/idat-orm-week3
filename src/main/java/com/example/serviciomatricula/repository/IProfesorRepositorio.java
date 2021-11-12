package com.example.serviciomatricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.serviciomatricula.entidad.Profesor;

public interface IProfesorRepositorio extends JpaRepository<Profesor, Integer>{

}
