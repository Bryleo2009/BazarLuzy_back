package com.ofsystem.capsofbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Orden_Compra_Cabecera")
public class Clase_OrdenCompra_Cabecera {
	
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id_occ;
        
        @Column(name = "Fecha_de_emision", nullable = false, length = 10)
	@Size(min = 10, message = "Nombre min de 10 caracter")
	private String fechaEmi_occ;
        
        @Column(name = "Monto_total", nullable = false, length = 10)
	@Size(min = 3, message = "Nombre min de 3 caracter")
	private double montoTotal_occ;

    public int getId_occ() {
        return id_occ;
    }

    public void setId_occ(int id_occ) {
        this.id_occ = id_occ;
    }

    public String getFechaEmi_occ() {
        return fechaEmi_occ;
    }

    public void setFechaEmi_occ(String fechaEmi_occ) {
        this.fechaEmi_occ = fechaEmi_occ;
    }

    public double getMontoTotal_occ() {
        return montoTotal_occ;
    }

    public void setMontoTotal_occ(double montoTotal_occ) {
        this.montoTotal_occ = montoTotal_occ;
    }
}
