package com.cenfotec.examen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="informacion_geografica")
public class Informacion_geografica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String pais;
	@Column
	private String continente;
	@Column
	private double superficie_terrestre;
	@Column
	private double superficie_maritima;
	
	public Informacion_geografica() {
	}

	public Informacion_geografica(int id, String pais, String continente, double superficie_terrestre,
			double superficie_maritima) {
		this.id = id;
		this.pais = pais;
		this.continente = continente;
		this.superficie_terrestre = superficie_terrestre;
		this.superficie_maritima = superficie_maritima;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getContinente() {
		return continente;
	}

	public void setContinente(String continente) {
		this.continente = continente;
	}

	public double getSuperficie_terrestre() {
		return superficie_terrestre;
	}

	public void setSuperficie_terrestre(double superficie_terrestre) {
		this.superficie_terrestre = superficie_terrestre;
	}

	public double getSuperficie_maritima() {
		return superficie_maritima;
	}

	public void setSuperficie_maritima(double superficie_maritima) {
		this.superficie_maritima = superficie_maritima;
	}
}
