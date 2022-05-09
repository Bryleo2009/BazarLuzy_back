package com.capsof.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "TipoPago")
public class TipoPago {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_tp;
	
	@Column(name = "Nombre_tp", nullable = false, length = 200)
    @Size(min = 2, message = "Nombre min de 2 caracter")
	private String nombre_tp;

	public int getId_tp() {
		return id_tp;
	}

	public void setId_tp(int id_tp) {
		this.id_tp = id_tp;
	}

	public String getNombre_tp() {
		return nombre_tp;
	}

	public void setNombre_tp(String nombre_tp) {
		this.nombre_tp = nombre_tp;
	}
	
	
}
