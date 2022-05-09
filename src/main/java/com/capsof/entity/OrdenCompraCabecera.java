package com.capsof.entity;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "OrdenCompraCabecera")
public class OrdenCompraCabecera {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_occ;
	
	private LocalDateTime fechaEmi_occ = LocalDateTime.now();
	
	@Column(name = "MontoTotal_OCC", nullable = false, length = 50)
    @Size(min = 2, message = "Nombre min de 3 caracter")
	private double monto_occ;
	

	public int getId_occ() {
		return id_occ;
	}

	public void setId_occ(int id_occ) {
		this.id_occ = id_occ;
	}

	public LocalDateTime getFechaEmi_occ() {
		return fechaEmi_occ;
	}

	public void setFechaEmi_occ(LocalDateTime fechaEmi_occ) {
		this.fechaEmi_occ = LocalDateTime.now();
	}

	public double getMonto_occ() {
		return monto_occ;
	}

	public void setMonto_occ(double monto_occ) {
		this.monto_occ = monto_occ;
	}
	
}
