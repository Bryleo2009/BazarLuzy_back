package com.capsof.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Servicios")
public class Servicio {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_serv;
	
	@Column(name = "MontoAgua", nullable = false, length = 20)
	private double montoAgua_serv;
	
	@Column(name = "MontoLuz", nullable = false, length = 20)
	private double montoLuz_serv;
	
	@Column(name = "MontoMante", nullable = false, length = 20)
	private double montoMante_serv;

	public int getId_serv() {
		return id_serv;
	}

	public void setId_serv(int id_serv) {
		this.id_serv = id_serv;
	}

	public double getMontoAgua_serv() {
		return montoAgua_serv;
	}

	public void setMontoAgua_serv(double montoAgua_serv) {
		this.montoAgua_serv = montoAgua_serv;
	}

	public double getMontoLuz_serv() {
		return montoLuz_serv;
	}

	public void setMontoLuz_serv(double montoLuz_serv) {
		this.montoLuz_serv = montoLuz_serv;
	}

	public double getMontoMante_serv() {
		return montoMante_serv;
	}

	public void setMontoMante_serv(double montoMante_serv) {
		this.montoMante_serv = montoMante_serv;
	}
	
}
