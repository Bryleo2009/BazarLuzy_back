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

import com.capsof.entity.OrdenCompraDetallado;
import com.capsof.service.IOrdenCompraDetalladoService;

@RestController
@RequestMapping("/ofsystem")
public class OrdenCompraDetalladoController {

	@Autowired
	private IOrdenCompraDetalladoService service;
	
	@GetMapping("/OrdenCompraDetallados")
	public List<OrdenCompraDetallado> listar() {
		return service.listar();		
	}
	
	@GetMapping("/OrdenCompraDetallados/{id}")
	public Optional<OrdenCompraDetallado> listarPorId(@PathVariable("id") OrdenCompraDetallado t) {
		return service.leer(t);		
	}
	
	@PostMapping("/OrdenCompraDetallados")
	public OrdenCompraDetallado registrar(@RequestBody OrdenCompraDetallado t) {
		return service.registrar(t);
	}
	
	@PutMapping("/OrdenCompraDetallados")
	public OrdenCompraDetallado modificar(@RequestBody OrdenCompraDetallado t) {
		return service.modificar(t);
	}
	
	@DeleteMapping("/OrdenCompraDetallados/{id}")
	public void eliminar(@PathVariable("id") OrdenCompraDetallado t) {
		service.eliminar(t);
	}
}
