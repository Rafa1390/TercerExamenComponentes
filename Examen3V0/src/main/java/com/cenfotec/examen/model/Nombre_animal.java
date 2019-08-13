package com.cenfotec.examen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="nombres_animales")
public class Nombre_animal {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int id_animal;
	@Column
	private String nombre;
	
	public Nombre_animal() {
	}

	public Nombre_animal(int id, int id_animal, String nombre) {
		this.id = id;
		this.id_animal = id_animal;
		this.nombre = nombre;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_animal() {
		return id_animal;
	}

	public void setId_animal(int id_animal) {
		this.id_animal = id_animal;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
