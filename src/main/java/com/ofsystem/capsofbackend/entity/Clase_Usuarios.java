package com.ofsystem.capsofbackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Usuarios")
public class Clase_Usuarios {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_usuario;
    
    @Column(name = "Usuario", nullable = false, length = 200)
    @Size(min = 3, message = "Minimo 3 caracteres")
    private String userName;
    
    @Column(name = "Contraseña", nullable = false, length = 200)
    @Size(min = 3, message = "Minimo 3 caracteres")
    private String password;
    
    @Column(name = "Estado", nullable = false, length = 1)
    @Size(min = 1, message = "Minimo un caracter")
    private String Estado;
    
    @Column(name = "Cargo", nullable = false, length = 200)
    @Size(min = 3, message = "Minimo 3 caracteres")
    private String nombre_cargo;

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getNombre_cargo() {
        return nombre_cargo;
    }

    public void setNombre_cargo(String nombre_cargo) {
        this.nombre_cargo = nombre_cargo;
    }
}
