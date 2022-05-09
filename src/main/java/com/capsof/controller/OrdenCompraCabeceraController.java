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

import com.capsof.entity.OrdenCompraCabecera;
import com.capsof.service.IOrdenCompraCabeceraService;

@RestController
@RequestMapping("/ofsystem")
public class OrdenCompraCabeceraController {

	@Autowired
	private IOrdenCompraCabeceraService service;
	
	@GetMapping("/OrdenCompraCabeceras")
	public List<OrdenCompraCabecera> listar() {
		return service.listar();		
	}
	
	@GetMapping("/OrdenCompraCabeceras/{id}")
	public Optional<OrdenCompraCabecera> listarPorId(@PathVariable("id") OrdenCompraCabecera t) {
		return service.leer(t);		
	}
	
	@PostMapping("/OrdenCompraCabeceras")
	public OrdenCompraCabecera registrar(@RequestBody OrdenCompraCabecera t) {
		return service.registrar(t);
	}
	
	@PutMapping("/OrdenCompraCabeceras")
	public OrdenCompraCabecera modificar(@RequestBody OrdenCompraCabecera t) {
		return service.modificar(t);
	}
	
	@DeleteMapping("/OrdenCompraCabeceras/{id}")
	public void eliminar(@PathVariable("id") OrdenCompraCabecera t) {
		service.eliminar(t);
	}
}
