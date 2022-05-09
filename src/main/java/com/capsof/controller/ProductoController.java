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

import com.capsof.entity.Producto;
import com.capsof.service.IProductoService;

@RestController
@RequestMapping("/ofsystem")
public class ProductoController {

	@Autowired
	private IProductoService service;
	
	@GetMapping("/Productos")
	public List<Producto> listar() {
		return service.listar();		
	}
	
	@GetMapping("/Productos/{id}")
	public Optional<Producto> listarPorId(@PathVariable("id") Producto t) {
		return service.leer(t);		
	}
	
	@PostMapping("/Productos")
	public Producto registrar(@RequestBody Producto t) {
		return service.registrar(t);
	}
	
	@PutMapping("/Productos")
	public Producto modificar(@RequestBody Producto t) {
		return service.modificar(t);
	}
	
	@DeleteMapping("/Productos/{id}")
	public void eliminar(@PathVariable("id") Producto t) {
		service.eliminar(t);
	}
}
