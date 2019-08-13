package com.cenfotec.examen.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cenfotec.examen.model.Informacion_geografica;
import com.cenfotec.examen.repository.Informacion_geografica_repository;

@RestController
public class Informacion_geografica_controller {
	@Autowired
	public Informacion_geografica_repository infoDeoRep;
	
	@GetMapping("/lista_info_geo")
	public List<Informacion_geografica> getListaInfo(){
		List<Informacion_geografica> listaInfo = infoDeoRep.findAll();
		return listaInfo;
	}
	
	@PostMapping("/registro_info")
	public String postInfo(@RequestBody Informacion_geografica info) {
		try {
			infoDeoRep.save(info);
			return "201 - Información registrada con exito";
		}catch(Exception e) {
			return "400 - Algo salió mal";
		}
	}
}
