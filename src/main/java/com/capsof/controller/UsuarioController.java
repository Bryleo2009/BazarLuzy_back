package com.capsof.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capsof.entity.Usuario;
import com.capsof.service.IUsuarioService;

@RestController
@RequestMapping("/ofsystem")
public class UsuarioController {

	@Autowired
	private IUsuarioService service;
	
	@GetMapping("/Usuarios")
	public List<Usuario> listar() {
		return service.listar();		
	}
	
	@GetMapping("/Usuarios/{id}")
	public Optional<Usuario> listarPorId(@PathVariable("id") Usuario t) {
		return service.leer(t);		
	}
	
	@PostMapping("/Usuarios")
	public Usuario registrar(@RequestBody Usuario t) {
		return service.registrar(t);
	}
	
	@PutMapping("/Usuarios")
	public Usuario modificar(@RequestBody Usuario t) {
		return service.modificar(t);
	}
	
	@DeleteMapping("/Usuarios/{id}")
	public void eliminar(@PathVariable("id") Usuario t) {
		service.eliminar(t);
	}
}
