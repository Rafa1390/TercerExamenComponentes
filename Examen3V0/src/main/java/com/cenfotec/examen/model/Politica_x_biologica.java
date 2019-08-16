package com.cenfotec.examen.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="politica_x_biologica")
public class Politica_x_biologica {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private int iddivreg;
	@Column
	private int iddivpol;
	
	public Politica_x_biologica() {
	}

	public Politica_x_biologica(int id, int iddivreg, int iddivpol) {
		this.id = id;
		this.iddivreg = iddivreg;
		this.iddivpol = iddivpol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getIddivreg() {
		return iddivreg;
	}

	public void setIddivreg(int iddivreg) {
		this.iddivreg = iddivreg;
	}

	public int getIddivpol() {
		return iddivpol;
	}

	public void setIddivpol(int iddivpol) {
		this.iddivpol = iddivpol;
	}
}
