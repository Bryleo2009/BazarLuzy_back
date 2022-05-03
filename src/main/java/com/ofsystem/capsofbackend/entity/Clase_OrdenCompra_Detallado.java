package com.ofsystem.capsofbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Orden_Compra_Detallado")
public class Clase_OrdenCompra_Detallado{
	
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id_ocd;
        
        @Column(name = "Cantidad_de_productos", nullable = false, length = 10)
	private int cant_lc;
        
        @Column(name = "Nombre_del_producto", nullable = false, length = 200)
	@Size(min = 3, message = "Nombre min de 3 caracter")
	private String nombreProducto_lc;
        
        @Column(name = "Descripcion_del_producto", nullable = false, length = 200)
	@Size(min = 3, message = "Nombre min de 3 caracter")
	private String descripcionProducto_lc;
        

    public int getId_ocd() {
        return id_ocd;
    }

    public void setId_ocd(int id_ocd) {
        this.id_ocd = id_ocd;
    }

    public int getCant_lc() {
        return cant_lc;
    }

    public void setCant_lc(int cant_lc) {
        this.cant_lc = cant_lc;
    }

    public String getNombreProducto_lc() {
        return nombreProducto_lc;
    }

    public void setNombreProducto_lc(String nombreProducto_lc) {
        this.nombreProducto_lc = nombreProducto_lc;
    }

    public String getDescripcionProducto_lc() {
        return descripcionProducto_lc;
    }

    public void setDescripcionProducto_lc(String descripcionProducto_lc) {
        this.descripcionProducto_lc = descripcionProducto_lc;
    }
}
