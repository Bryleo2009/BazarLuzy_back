package com.capsof.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "OrdenCompraDetallado")
public class OrdenCompraDetallado {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_ocd;
	
	@Column(name = "Cant_ODC", nullable = false, length = 10)
	private int cant_ocd;
	
	@Column(name = "Producto_ODC", nullable = false, length = 200)
    @Size(min = 2, message = "Nombre min de 3 caracter")
	private String producto_ocd;
	
	@Column(name = "Descripcion_ODC", nullable = false, length = 200)
    @Size(min = 2, message = "Nombre min de 3 caracter")
	private String descripcion_ocd;

	@ManyToOne
	@JoinColumn(name="id_occ", nullable = false, foreignKey = @ForeignKey(name = "fk_cabecera"))
	private OrdenCompraCabecera orden;
	
	
	public OrdenCompraCabecera getId_occ() {
		return orden;
	}

	public void setId_occ(OrdenCompraCabecera id_occ) {
		this.orden = id_occ;
	}



	public int getId_ocd() {
		return id_ocd;
	}

	public void setId_ocd(int id_ocd) {
		this.id_ocd = id_ocd;
	}

	public int getCant_ocd() {
		return cant_ocd;
	}

	public void setCant_ocd(int cant_ocd) {
		this.cant_ocd = cant_ocd;
	}

	public String getProducto_ocd() {
		return producto_ocd;
	}

	public void setProducto_ocd(String producto_ocd) {
		this.producto_ocd = producto_ocd;
	}

	public String getDescripcion_ocd() {
		return descripcion_ocd;
	}

	public void setDescripcion_ocd(String descripcion_ocd) {
		this.descripcion_ocd = descripcion_ocd;
	}
	
}
