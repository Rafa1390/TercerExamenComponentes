package com.cenfotec.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenfotec.examen.model.Division_regional_biologica;

public interface Division_regional_biologica_repository extends JpaRepository<Division_regional_biologica, Integer>{
	List<Division_regional_biologica> findByidpais(int idpais);
}
