package com.ofsystem.capsofbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Orden_de_reclamo")
public class Clase_OrdenDeReclamo {
    
        @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_or;
        
        @Column(name = "Nombre_proveedor", nullable = false, length = 200)
	@Size(min = 3, message = "Nombre min de 3 caracter")
	private String proveedor_or;
        
        @Column(name = "Observación", nullable = false, length = 200)
	@Size(min = 3, message = "Minimo 3 caracter")
	private String observacion_or;
        
        @Column(name = "Fecha", nullable = false, length = 10)
	@Size(min = 10, message = "Nombre min de 10 caracter")
	private String fechaEmision_or;
    
    public int getId_or() {
        return id_or;
    }

    public void setId_or(int id_or) {
        this.id_or = id_or;
    }

    public String getProveedor_or() {
        return proveedor_or;
    }

    public void setProveedor_or(String proveedor_or) {
        this.proveedor_or = proveedor_or;
    }

    public String getObservacion_or() {
        return observacion_or;
    }

    public void setObservacion_or(String observacion_or) {
        this.observacion_or = observacion_or;
    }

    public String getFechaEmision_or() {
        return fechaEmision_or;
    }

    public void setFechaEmision_or(String fechaEmision_or) {
        this.fechaEmision_or = fechaEmision_or;
    }
}
