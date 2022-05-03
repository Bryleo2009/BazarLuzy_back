package com.ofsystem.capsofbackend.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ofsystem.capsofbackend.entity.Clase_OrdenDeReclamo;
import com.ofsystem.capsofbackend.service.IOrdenDeReclamoService;

@RestController
public class OrdenDeReclamoController {
	@Autowired
	private IOrdenDeReclamoService service;
	
	/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url 
    http://127.0.0.1:8080/api/users*/
	@GetMapping("/Clase_OrdenDeReclamo")
	public List<Clase_OrdenDeReclamo> listar() {
		return service.listar();
		
	}
	
	/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url + el id de un usuario
    http://127.0.0.1:8080/api/users/1*/
	@GetMapping("/Clase_OrdenDeReclamo/{id}")
	public Optional<Clase_OrdenDeReclamo> listarPorId(@PathVariable("id") Clase_OrdenDeReclamo per) {
		return service.leer(per);
		
	}
	
	/*Este método se hará cuando por una petición POST (como indica la anotación) se llame a la url
    http://127.0.0.1:8080/api/users/  */
	@PostMapping("/Clase_OrdenDeReclamo")
	public Clase_OrdenDeReclamo registrar(@RequestBody Clase_OrdenDeReclamo per) {
		return service.registrar(per);
	}
	
	/*Este método se hará cuando por una petición PUT (como indica la anotación) se llame a la url
    http://127.0.0.1:8080/api/users/  */
	@PutMapping("/Clase_OrdenDeReclamo")
	public Clase_OrdenDeReclamo modificar(@RequestBody Clase_OrdenDeReclamo per) {
		return service.modificar(per);
	}
	
	/*Este método se hará cuando por una petición DELETE (como indica la anotación) se llame a la url + id del usuario
    http://127.0.0.1:8080/api/users/1  */
	@DeleteMapping("/Clase_OrdenDeReclamo/{id}")
	public void eliminar(@PathVariable("id") Clase_OrdenDeReclamo idClase_OrdenDeReclamo) {
		service.eliminar(idClase_OrdenDeReclamo);
	}
}
