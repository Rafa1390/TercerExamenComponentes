package com.cenfotec.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenfotec.examen.model.Biodiversidad;

public interface Biodiversidad_repository extends JpaRepository<Biodiversidad, Integer>{
	List<Biodiversidad> findByidpais(int idpais);
}
