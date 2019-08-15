package com.cenfotec.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cenfotec.examen.model.Division_politica;
import com.cenfotec.examen.repository.Division_politica_repository;

@RestController
public class Division_politica_controller {
	@Autowired
	public Division_politica_repository divPolRepo;
	
	@GetMapping(path = {"/div_politica/{idpais}"})
	public List<Division_politica> findByIdPais(@PathVariable int idpais){
		List<Division_politica> listaDivPol = divPolRepo.findByidpais(idpais);
		return listaDivPol;
	}
	
	@PostMapping("/registro_div_politica")
	public String postDivPolitica(@RequestBody Division_politica divPol) {
		try {
			divPolRepo.save(divPol);
			return "201 - Información registrada con exito";
		}catch(Exception e) {
			return "400 - Algo salió mal";
		}
	}
}
