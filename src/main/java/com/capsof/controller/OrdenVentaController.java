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

import com.capsof.entity.OrdenVenta;
import com.capsof.service.IOrdenVentaService;

@RestController
@RequestMapping("/ofsystem")
public class OrdenVentaController {

	@Autowired
	private IOrdenVentaService service;
	
	@GetMapping("/OrdenVentas")
	public List<OrdenVenta> listar() {
		return service.listar();		
	}
	
	@GetMapping("/OrdenVentas/{id}")
	public Optional<OrdenVenta> listarPorId(@PathVariable("id") OrdenVenta t) {
		return service.leer(t);		
	}
	
	@PostMapping("/OrdenVentas")
	public OrdenVenta registrar(@RequestBody OrdenVenta t) {
		return service.registrar(t);
	}
	
	@PutMapping("/OrdenVentas")
	public OrdenVenta modificar(@RequestBody OrdenVenta t) {
		return service.modificar(t);
	}
	
	@DeleteMapping("/OrdenVentas/{id}")
	public void eliminar(@PathVariable("id") OrdenVenta t) {
		service.eliminar(t);
	}
}
