package com.cenfotec.examen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nombres_comunes")
public class Nombre_comun {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int idbio;
	@Column
	private String nombre;
	
	public Nombre_comun() {
	}

	public Nombre_comun(int id, int idbio, String nombre) {
		this.id = id;
		this.idbio = idbio;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdbio() {
		return idbio;
	}

	public void setIdbio(int idbio) {
		this.idbio = idbio;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
