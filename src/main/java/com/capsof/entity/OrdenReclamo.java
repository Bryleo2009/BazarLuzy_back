package com.capsof.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "OrdenReclamo")
public class OrdenReclamo {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_or;
	
	@Column(name = "Provedor_or", nullable = false, length = 250)
    @Size(min = 3, message = "Nombre min de 3 caracter")
	private String provedor_or;
	
	@Column(name = "Observaciones_or", nullable = false, length = 250)
    @Size(min = 3, message = "Nombre min de 3 caracter")
	private String observaciones_or;
	
	
	private LocalDateTime fechaEmi_or = LocalDateTime.now();


	public int getId_or() {
		return id_or;
	}


	public void setId_or(int id_or) {
		this.id_or = id_or;
	}


	public String getProvedor_or() {
		return provedor_or;
	}


	public void setProvedor_or(String provedor_or) {
		this.provedor_or = provedor_or;
	}


	public String getObservaciones_or() {
		return observaciones_or;
	}


	public void setObservaciones_or(String observaciones_or) {
		this.observaciones_or = observaciones_or;
	}


	public LocalDateTime getFechaEmi_or() {
		return fechaEmi_or;
	}


	public void setFechaEmi_or(LocalDateTime fechaEmi_or) {
		this.fechaEmi_or = LocalDateTime.now();
	}
	
	
}
