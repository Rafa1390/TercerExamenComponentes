package com.cenfotec.examen.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cenfotec.examen.model.Biodiversidad;

public interface Biodiversidad_repository extends JpaRepository<Biodiversidad, Integer>{
	List<Biodiversidad> findByidpais(int idpais);
	
	@Query("SELECT b FROM Biodiversidad b WHERE b.idpais = ?1 and b.tipo = ?2")
	List<Biodiversidad> findBiodiversidadByidpaisAndtipo(Integer idpais, String tipo);
	
	@Query("SELECT b FROM Biodiversidad b WHERE b.nombrecient LIKE ?1%")
	List<Biodiversidad> findByNombrecientStartsWith(String nombrecient);
}
