package com.ofsystem.capsofbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Producto")
public class Clase_Producto {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_producto;
    
    @Column(name = "Nombre_de_producto", nullable = false, length = 50)
    @Size(min = 3, message = "Nombre min de 3 caracter")
    private String nombre_product;
    
    @Column(name = "Precio_unitario", nullable = false, length = 10)
    @Size(min = 3, message = "Nombre min de 3 caracter")
    private double precioUni_product;
    
    @Column(name = "Stock", nullable = false, length = 10)
    @Size(min = 3, message = "Nombre min de 3 caracter")
    private int cant_producto;

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
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

    public int getCant_producto() {
        return cant_producto;
    }

    public void setCant_producto(int cant_producto) {
        this.cant_producto = cant_producto;
    }
}
