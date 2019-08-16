package com.cenfotec.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cenfotec.examen.model.Biodiversidad;
import com.cenfotec.examen.repository.Biodiversidad_repository;

@RestController
public class Biodiversidad_controller {
	@Autowired
	Biodiversidad_repository bioRepo;
	
	@GetMapping(path = {"/biodiversidad_por_pais/{idpais}"})
	public List<Biodiversidad> findByPais(@PathVariable int idpais){
		List<Biodiversidad> listaBio = bioRepo.findByidpais(idpais);
		return listaBio;
	}
	
	@PostMapping("/registro_biodiversidad")
	public String postBiodiversidad(@RequestBody Biodiversidad bio) {
		try {
			bioRepo.save(bio);
			return "201 - Información registrada con exito";
		}catch(Exception e) {
			return "400 - Algo salió mal";
		}
	}
}
