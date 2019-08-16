package com.cenfotec.examen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="biodiversidad")
public class Biodiversidad {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String tipo;
	@Column
	private String nombrecient;
	@Column
	private String peligro;
	@Column
	private int poblacion;
	@Column
	private int idpais;
	
	public Biodiversidad() {
	}

	public Biodiversidad(int id, String tipo, String nombrecient, String peligro, int poblacion, int idpais) {
		this.id = id;
		this.tipo = tipo;
		this.nombrecient = nombrecient;
		this.peligro = peligro;
		this.poblacion = poblacion;
		this.idpais = idpais;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNombrecient() {
		return nombrecient;
	}

	public void setNombrecient(String nombrecient) {
		this.nombrecient = nombrecient;
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

	public int getIdpais() {
		return idpais;
	}

	public void setIdpais(int idpais) {
		this.idpais = idpais;
	}
}
