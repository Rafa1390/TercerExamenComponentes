package com.cenfotec.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cenfotec.examen.model.Nombre_comun;

public interface Nombre_comun_repository extends JpaRepository<Nombre_comun, Integer>{
	List<Nombre_comun> findByidbio(int idbio);
}
