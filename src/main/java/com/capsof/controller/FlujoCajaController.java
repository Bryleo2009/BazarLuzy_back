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

import com.capsof.entity.FlujoCaja;
import com.capsof.service.IFlujoCajaService;

@RestController
@RequestMapping("/ofsystem")
public class FlujoCajaController {

	@Autowired
	private IFlujoCajaService service;
	
	@GetMapping("/FlujoCajas")
	public List<FlujoCaja> listar() {
		return service.listar();		
	}
	
	@GetMapping("/FlujoCajas/{id}")
	public Optional<FlujoCaja> listarPorId(@PathVariable("id") FlujoCaja t) {
		return service.leer(t);		
	}
	
	@PostMapping("/FlujoCajas")
	public FlujoCaja registrar(@RequestBody FlujoCaja t) {
		return service.registrar(t);
	}
	
	@PutMapping("/FlujoCajas")
	public FlujoCaja modificar(@RequestBody FlujoCaja t) {
		return service.modificar(t);
	}
	
	@DeleteMapping("/FlujoCajas/{id}")
	public void eliminar(@PathVariable("id") FlujoCaja t) {
		service.eliminar(t);
	}
}
