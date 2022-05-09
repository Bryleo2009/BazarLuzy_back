package com.capsof.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Comprobante")
public class ComprobantePago {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_cp;
	
	private LocalDateTime fechaEmi_cp = LocalDateTime.now();
	
	@Column(name = "MontoTotal_cp", nullable = false, length = 20)
	private double montoTotal_cp;
	
	@Column(name = "NombreCliente_cp", nullable = false, length = 200)
    @Size(min = 3, message = "Nombre min de 3 caracter")
	private String nombreCliente_cp;
	
	@ManyToOne
	@JoinColumn(name="id_tp", nullable = false, foreignKey = @ForeignKey(name = "fk_id_tp"))
	private TipoPago id_tp;
	
	@OneToOne
	@JoinColumn(name="id_ov", nullable = false, foreignKey = @ForeignKey(name = "fk_id_ov"))
	private OrdenVenta id_ov;
	
	@ManyToOne
	@JoinColumn(name="id_tc", nullable = false, foreignKey = @ForeignKey(name = "fk_id_tc"))
	private TipoComprobante id_tc;

	public int getId_cp() {
		return id_cp;
	}

	public void setId_cp(int id_cp) {
		this.id_cp = id_cp;
	}

	public LocalDateTime getFechaEmi_cp() {
		return fechaEmi_cp;
	}

	public void setFechaEmi_cp(LocalDateTime fechaEmi_cp) {
		this.fechaEmi_cp = fechaEmi_cp;
	}

	public double getMontoTotal_cp() {
		return montoTotal_cp;
	}

	public void setMontoTotal_cp(double montoTotal_cp) {
		this.montoTotal_cp = montoTotal_cp;
	}

	public String getNombreCliente_cp() {
		return nombreCliente_cp;
	}

	public void setNombreCliente_cp(String nombreCliente_cp) {
		this.nombreCliente_cp = nombreCliente_cp;
	}

	public TipoPago getId_tp() {
		return id_tp;
	}

	public void setId_tp(TipoPago id_tp) {
		this.id_tp = id_tp;
	}

	public OrdenVenta getId_ov() {
		return id_ov;
	}

	public void setId_ov(OrdenVenta id_ov) {
		this.id_ov = id_ov;
	}

	public TipoComprobante getId_tc() {
		return id_tc;
	}

	public void setId_tc(TipoComprobante id_tc) {
		this.id_tc = id_tc;
	}
	
	
}
