package com.capsof.controller;

import java.time.LocalDateTime;
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

import com.capsof.entity.ComprobantePago;
import com.capsof.service.IComprobantePagoService;

@RestController
@RequestMapping("/ofsystem")
public class ComprobantePagoController {

	@Autowired
	private IComprobantePagoService service;
	
	@GetMapping("/ComprobantePagos")
	public List<ComprobantePago> listar() {
		return service.listar();		
	}
	
	@GetMapping("/ComprobantePagos/{id}")
	public Optional<ComprobantePago> listarPorId(@PathVariable("id") ComprobantePago t) {
		return service.leer(t);		
	}
	
	@PostMapping("/ComprobantePagos")
	public ComprobantePago registrar(@RequestBody ComprobantePago t) {
		//t.setFechaEmi_cp(LocalDateTime.now());
		return service.registrar(t);
	}
	
	@PutMapping("/ComprobantePagos")
	public ComprobantePago modificar(@RequestBody ComprobantePago t) {
		return service.modificar(t);
	}
	
	@DeleteMapping("/ComprobantePagos/{id}")
	public void eliminar(@PathVariable("id") ComprobantePago t) {
		service.eliminar(t);
	}
}
