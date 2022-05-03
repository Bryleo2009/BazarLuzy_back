package com.ofsystem.capsofbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Orden_de_venta")
public class Clase_OrdenDeVenta {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_ov;
    
    @Column(name = "Cantidad", nullable = false, length = 10)
    @Size(min = 10, message = "Nombre min de 10 caracter")
    private int cant_ov;
    /*
    @Column(name = "Producto", nullable = false, length = 50)
    @Size(min = 3, message = "Nombre min de 10 caracter")
    Clase_Producto producto;
*/
    public int getId_ov() {
        return id_ov;
    }

    public void setId_ov(int id_ov) {
        this.id_ov = id_ov;
    }

    public int getCant_ov() {
        return cant_ov;
    }

    public void setCant_ov(int cant_ov) {
        this.cant_ov = cant_ov;
    }
/*
    public Clase_Producto getProduct() {
        return producto;
    }

    public void setProduct(Clase_Producto product) {
        this.producto = product;
    }*/
}
