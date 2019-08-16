package com.cenfotec.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cenfotec.examen.model.Division_regional_biologica;
import com.cenfotec.examen.repository.Division_regional_biologica_repository;

@RestController
public class Division_regional_biologica_controller {
	@Autowired
	Division_regional_biologica_repository divBioRepo;
	
	@GetMapping(path = {"/div_biologica/{idpais}"})
	public List<Division_regional_biologica> findByIdPais(@PathVariable int idpais){
		List<Division_regional_biologica> listaDivBio = divBioRepo.findByidpais(idpais);
		return listaDivBio;
	}
	
	@PostMapping("/registro_div_biologica")
	public String postDivBiologica(@RequestBody Division_regional_biologica divBio) {
		try {
			divBioRepo.save(divBio);
			return "201 - Información registrada con exito";
		}catch(Exception e) {
			return "400 - Algo salió mal";
		}
	}
}
