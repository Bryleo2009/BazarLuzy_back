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

import com.capsof.entity.TipoComprobante;
import com.capsof.service.ITipoComprobanteService;

@RestController
@RequestMapping("/ofsystem")
public class TipoComprobanteController {

	@Autowired
	private ITipoComprobanteService service;
	
	@GetMapping("/TipoComprobantes")
	public List<TipoComprobante> listar() {
		return service.listar();		
	}
	
	@GetMapping("/TipoComprobantes/{id}")
	public Optional<TipoComprobante> listarPorId(@PathVariable("id") TipoComprobante t) {
		return service.leer(t);		
	}
	
	@PostMapping("/TipoComprobantes")
	public TipoComprobante registrar(@RequestBody TipoComprobante t) {
		return service.registrar(t);
	}
	
	@PutMapping("/TipoComprobantes")
	public TipoComprobante modificar(@RequestBody TipoComprobante t) {
		return service.modificar(t);
	}
	
	@DeleteMapping("/TipoComprobantes/{id}")
	public void eliminar(@PathVariable("id") TipoComprobante t) {
		service.eliminar(t);
	}
}
