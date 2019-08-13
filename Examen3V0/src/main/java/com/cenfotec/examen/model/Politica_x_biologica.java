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
	private int id_div_reg;
	@Column
	private int id_div_pol;
	
	public Politica_x_biologica() {
	}

	public Politica_x_biologica(int id, int id_div_reg, int id_div_pol) {
		this.id = id;
		this.id_div_reg = id_div_reg;
		this.id_div_pol = id_div_pol;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId_div_reg() {
		return id_div_reg;
	}

	public void setId_div_reg(int id_div_reg) {
		this.id_div_reg = id_div_reg;
	}

	public int getId_div_pol() {
		return id_div_pol;
	}

	public void setId_div_pol(int id_div_pol) {
		this.id_div_pol = id_div_pol;
	}
}
