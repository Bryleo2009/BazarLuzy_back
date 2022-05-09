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

import com.capsof.entity.Servicio;
import com.capsof.service.IServicioService;

@RestController
@RequestMapping("/ofsystem")
public class ServicioController {

	@Autowired
	private IServicioService service;
	
	@GetMapping("/Servicios")
	public List<Servicio> listar() {
		return service.listar();		
	}
	
	@GetMapping("/Servicios/{id}")
	public Optional<Servicio> listarPorId(@PathVariable("id") Servicio t) {
		return service.leer(t);		
	}
	
	@PostMapping("/Servicios")
	public Servicio registrar(@RequestBody Servicio t) {
		return service.registrar(t);
	}
	
	@PutMapping("/Servicios")
	public Servicio modificar(@RequestBody Servicio t) {
		return service.modificar(t);
	}
	
	@DeleteMapping("/Servicios/{id}")
	public void eliminar(@PathVariable("id") Servicio t) {
		service.eliminar(t);
	}
}
