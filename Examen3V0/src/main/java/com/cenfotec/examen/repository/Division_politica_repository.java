package com.cenfotec.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cenfotec.examen.model.Division_politica;

public interface Division_politica_repository extends JpaRepository<Division_politica, Integer>{
	List<Division_politica> findByidpais(int idpais);
	
	@Query("SELECT dp FROM Division_politica dp WHERE dp.nombre LIKE ?1%")
	List<Division_politica> findByNombreStartsWith(String nombre);
}
