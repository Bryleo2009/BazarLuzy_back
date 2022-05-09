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

import com.capsof.entity.OrdenReclamo;
import com.capsof.service.IOrdenReclamoService;

@RestController
@RequestMapping("/ofsystem")
public class OrdenReclamoController {

	@Autowired
	private IOrdenReclamoService service;
	
	@GetMapping("/OrdenReclamos")
	public List<OrdenReclamo> listar() {
		return service.listar();		
	}
	
	@GetMapping("/OrdenReclamos/{id}")
	public Optional<OrdenReclamo> listarPorId(@PathVariable("id") OrdenReclamo t) {
		return service.leer(t);		
	}
	
	@PostMapping("/OrdenReclamos")
	public OrdenReclamo registrar(@RequestBody OrdenReclamo t) {
		return service.registrar(t);
	}
	
	@PutMapping("/OrdenReclamos")
	public OrdenReclamo modificar(@RequestBody OrdenReclamo t) {
		return service.modificar(t);
	}
	
	@DeleteMapping("/OrdenReclamos/{id}")
	public void eliminar(@PathVariable("id") OrdenReclamo t) {
		service.eliminar(t);
	}
}
