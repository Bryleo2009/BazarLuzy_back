package com.ofsystem.capsofbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Comprobante")
public class Clase_Comprobante {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_cp;
    
    @Column(name = "Tipo_comprobante", nullable = false, length = 200)
    @Size(min = 3, message = "Nombre min de 3 caracter")
    private String nombre_tc;
    
    /*@Column(name = "Orden_de_venta", nullable = false, length = 50)
    Clase_OrdenDeVenta ordenVenta;*/
    
    @Column(name = "Tipo_de_pago", nullable = false, length = 200)
    @Size(min = 3, message = "Nombre min de 3 caracter")
    private String nombre_tp;
    
    @Column(name = "Fecha_de_emision", nullable = false, length = 10)
    @Size(min = 10, message = "Nombre min de 10 caracter")
    private String fechaEmi_cp;
    
    @Column(name = "Monto_total", nullable = false, length = 10)
    private double montoTotal_cp;
    
    @Column(name = "Nombre_del_cliente", nullable = false, length = 200)
    @Size(min = 3, message = "Nombre min de 3 caracter")
    private String nombreCliente_cp;

    public int getId_cp() {
        return id_cp;
    }

    public void setId_cp(int id_cp) {
        this.id_cp = id_cp;
    }

    public String getNombre_tc() {
        return nombre_tc;
    }

    public void setNombre_tc(String nombre_tc) {
        this.nombre_tc = nombre_tc;
    }
/*
    public Clase_OrdenDeVenta getOrdenVenta() {
        return ordenVenta;
    }

    public void setOrdenVenta(Clase_OrdenDeVenta ordenVenta) {
        this.ordenVenta = ordenVenta;
    }
*/
    public String getNombre_tp() {
        return nombre_tp;
    }

    public void setNombre_tp(String nombre_tp) {
        this.nombre_tp = nombre_tp;
    }

    public String getFechaEmi_cp() {
        return fechaEmi_cp;
    }

    public void setFechaEmi_cp(String fechaEmi_cp) {
        this.fechaEmi_cp = fechaEmi_cp;
    }

    public double getMontoTotal_cp() {
        return montoTotal_cp;
    }
}
