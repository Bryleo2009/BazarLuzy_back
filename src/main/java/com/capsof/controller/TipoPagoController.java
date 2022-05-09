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

import com.capsof.entity.TipoPago;
import com.capsof.service.ITipoPagoService;

@RestController
@RequestMapping("/ofsystem")
public class TipoPagoController {

	@Autowired
	private ITipoPagoService service;
	
	@GetMapping("/TipoPagos")
	public List<TipoPago> listar() {
		return service.listar();		
	}
	
	@GetMapping("/TipoPagos/{id}")
	public Optional<TipoPago> listarPorId(@PathVariable("id") TipoPago t) {
		return service.leer(t);		
	}
	
	@PostMapping("/TipoPagos")
	public TipoPago registrar(@RequestBody TipoPago t) {
		return service.registrar(t);
	}
	
	@PutMapping("/TipoPagos")
	public TipoPago modificar(@RequestBody TipoPago t) {
		return service.modificar(t);
	}
	
	@DeleteMapping("/TipoPagos/{id}")
	public void eliminar(@PathVariable("id") TipoPago t) {
		service.eliminar(t);
	}
}
