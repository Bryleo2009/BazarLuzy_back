package com.capsof.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "Usuario")
public class Usuario {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_usuario;
	
	@Column(name = "username", nullable = false, length = 200)
    @Size(min = 3, message = "Nombre min de 3 caracter")
	private String username;
	
	@Column(name = "password", nullable = false, length = 200)
    @Size(min = 3, message = "Nombre min de 3 caracter")
	private String password;
	
	private boolean estado;
	
	@Column(name = "cargo", nullable = false, length = 100)
    @Size(min = 3, message = "Nombre min de 3 caracter")
	private String cargo;
	

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(int id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isEstado() {
		return estado;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	
}
