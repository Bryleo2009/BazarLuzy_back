package com.capsof.entity;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Producto_OV")
public class ProductoOV {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_pov;
	
	@ManyToOne
	@JoinColumn(name="id_product", nullable = false, foreignKey = @ForeignKey(name = "fk_producto"))
	private Producto id_product;
	
	
	@ManyToOne
	@JoinColumn(name="id_ov", nullable = false, foreignKey = @ForeignKey(name = "fk_ordenventa"))
	private OrdenVenta id_ov;

	public Producto getId_product() {
		return id_product;
	}

	public void setId_product(Producto id_product) {
		this.id_product = id_product;
	}

	public OrdenVenta getId_ov() {
		return id_ov;
	}

	public void setId_ov(OrdenVenta id_ov) {
		this.id_ov = id_ov;
	}
	
}
