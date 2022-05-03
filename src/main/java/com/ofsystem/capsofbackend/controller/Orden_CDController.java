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

import com.ofsystem.capsofbackend.entity.Clase_OrdenCompra_Detallado;
import com.ofsystem.capsofbackend.service.IOrdenCDService;

@RestController
public class Orden_CDController {
	@Autowired
	private IOrdenCDService service;
	
	/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url 
    http://127.0.0.1:8080/api/users*/
	@GetMapping("/Clase_OrdenCompra_Detallado")
	public List<Clase_OrdenCompra_Detallado> listar() {
		return service.listar();
		
	}
	
	/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url + el id de un usuario
    http://127.0.0.1:8080/api/users/1*/
	@GetMapping("/Clase_OrdenCompra_Detallado/{id}")
	public Optional<Clase_OrdenCompra_Detallado> listarPorId(@PathVariable("id") Clase_OrdenCompra_Detallado per) {
		return service.leer(per);
		
	}
	
	/*Este método se hará cuando por una petición POST (como indica la anotación) se llame a la url
    http://127.0.0.1:8080/api/users/  */
	@PostMapping("/Clase_OrdenCompra_Detallado")
	public Clase_OrdenCompra_Detallado registrar(@RequestBody Clase_OrdenCompra_Detallado per) {
		return service.registrar(per);
	}
	
	/*Este método se hará cuando por una petición PUT (como indica la anotación) se llame a la url
    http://127.0.0.1:8080/api/users/  */
	@PutMapping("/Clase_OrdenCompra_Detallado")
	public Clase_OrdenCompra_Detallado modificar(@RequestBody Clase_OrdenCompra_Detallado per) {
		return service.modificar(per);
	}
	
	/*Este método se hará cuando por una petición DELETE (como indica la anotación) se llame a la url + id del usuario
    http://127.0.0.1:8080/api/users/1  */
	@DeleteMapping("/Clase_OrdenCompra_Detallado/{id}")
	public void eliminar(@PathVariable("id") Clase_OrdenCompra_Detallado idClase_OrdenCompra_Detallado) {
		service.eliminar(idClase_OrdenCompra_Detallado);
	}
}
