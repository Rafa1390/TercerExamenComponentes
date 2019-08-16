package com.cenfotec.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cenfotec.examen.model.Nombre_comun;
import com.cenfotec.examen.repository.Nombre_comun_repository;

@RestController
public class Nombre_comun_controller {
	@Autowired
	Nombre_comun_repository nmRepo;
	
	@GetMapping(path = {"/nombre_comun_por_bio/{idbio}"})
	public List<Nombre_comun> findByBio(@PathVariable int idbio){
		List<Nombre_comun> listaNombre = nmRepo.findByidbio(idbio);
		return listaNombre;
	}
	
	@PostMapping("/registro_nombre_comun")
	public String postNombreComun(@RequestBody Nombre_comun nomCo) {
		try {
			nmRepo.save(nomCo);
			return "201 - Información registrada con exito";
		}catch(Exception e) {
			return "400 - Algo salió mal";
		}
	}
}
