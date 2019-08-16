package com.cenfotec.examen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="division_politica")
public class Division_politica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int idpais;
	@Column
	private String nombre;
	@Column
	private int idreg;
	
	public Division_politica() {
	}

	public Division_politica(int id, int idpais, String nombre, int idreg) {
		this.id = id;
		this.idpais = idpais;
		this.nombre = nombre;
		this.idreg = idreg;
	}

	public int getIdreg() {
		return idreg;
	}

	public void setIdreg(int idreg) {
		this.idreg = idreg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIdpais() {
		return idpais;
	}

	public void setIdpais(int idpais) {
		this.idpais = idpais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
