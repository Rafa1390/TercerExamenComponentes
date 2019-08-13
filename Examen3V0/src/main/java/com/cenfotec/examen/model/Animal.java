package com.cenfotec.examen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="animales")
public class Animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nombre_cientifico;
	@Column
	private String peligro;
	@Column
	private int poblacion;
	
	public Animal() {
	}

	public Animal(int id, String nombre_cientifico, String peligro, int poblacion) {
		this.id = id;
		this.nombre_cientifico = nombre_cientifico;
		this.peligro = peligro;
		this.poblacion = poblacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre_cientifico() {
		return nombre_cientifico;
	}

	public void setNombre_cientifico(String nombre_cientifico) {
		this.nombre_cientifico = nombre_cientifico;
	}

	public String getPeligro() {
		return peligro;
	}

	public void setPeligro(String peligro) {
		this.peligro = peligro;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
}
