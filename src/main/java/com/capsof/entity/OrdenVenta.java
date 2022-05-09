package com.capsof.entity;


import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name = "OrdenVenta")
public class OrdenVenta {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ov;
	
	@Column(name = "Cantidad_ov", nullable = false, length = 10)
	private double cantidad_ov;

	public int getId_ov() {
		return id_ov;
	}

	public void setId_ov(int id_ov) {
		this.id_ov = id_ov;
	}

	public double getCantidad_ov() {
		return cantidad_ov;
	}

	public void setCantidad_ov(double cantidad_ov) {
		this.cantidad_ov = cantidad_ov;
	}
	
	
	
}
