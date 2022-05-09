package com.capsof.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TipoComprobante")
public class TipoComprobante {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_tc;
	
	@Column(name = "Nombre_tc", nullable = false, length = 200)
    @Size(min = 2, message = "Nombre min de 2 caracter")
	private String nombre_tc;

	public int getId_tc() {
		return id_tc;
	}

	public void setId_tc(int id_tc) {
		this.id_tc = id_tc;
	}

	public String getNombre_tc() {
		return nombre_tc;
	}

	public void setNombre_tc(String nombre_tc) {
		this.nombre_tc = nombre_tc;
	}
	
}
