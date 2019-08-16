package com.cenfotec.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenfotec.examen.model.Politica_x_biologica;

public interface Politica_x_biologica_repository extends JpaRepository<Politica_x_biologica, Integer>{
	List<Politica_x_biologica> findByiddivreg(int iddivreg);
}
