package com.capsof.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_product;
	
	@Column(name = "Nombre_producto", nullable = false)
    @Size(min = 3, message = "Nombre min de 3 caracter")
	private String nombre_product;
	
	@Column(name = "Precio_unitario", nullable = false, length = 10)
    @Size(min = 3, message = "Nombre min de 3 caracter")
	private double precioUni_product;
	
	@Column(name = "Stock", nullable = false, length = 10)
	private int cant_product;

	public int getId_product() {
		return id_product;
	}

	public void setId_product(int id_product) {
		this.id_product = id_product;
	}

	public String getNombre_product() {
		return nombre_product;
	}

	public void setNombre_product(String nombre_product) {
		this.nombre_product = nombre_product;
	}

	public double getPrecioUni_product() {
		return precioUni_product;
	}

	public void setPrecioUni_product(double precioUni_product) {
		this.precioUni_product = precioUni_product;
	}

	public int getCant_product() {
		return cant_product;
	}

	public void setCant_product(int cant_product) {
		this.cant_product = cant_product;
	}
	
}
