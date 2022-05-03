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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ofsystem.capsofbackend.entity.Clase_Comprobante;
import com.ofsystem.capsofbackend.service.IComprobanteService;

@RestController
@RequestMapping("/ofsystem")
public class ComprobanteController {
	@Autowired
	private IComprobanteService service;
	
	/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url 
    http://127.0.0.1:8080/api/users*/
	@GetMapping("/Clase_Comprobante")
	public List<Clase_Comprobante> listar() {
		return service.listar();
		
	}
	
	/*Este método se hará cuando por una petición GET (como indica la anotación) se llame a la url + el id de un usuario
    http://127.0.0.1:8080/api/users/1*/
	@GetMapping("/Clase_Comprobante/{id}")
	public Optional<Clase_Comprobante> listarPorId(@PathVariable("id") Clase_Comprobante per) {
		return service.leer(per);
		
	}
	
	/*Este método se hará cuando por una petición POST (como indica la anotación) se llame a la url
    http://127.0.0.1:8080/api/users/  */
	@PostMapping("/Clase_Comprobante")
	public Clase_Comprobante registrar(@RequestBody Clase_Comprobante per) {
		return service.registrar(per);
	}
	
	/*Este método se hará cuando por una petición PUT (como indica la anotación) se llame a la url
    http://127.0.0.1:8080/api/users/  */
	@PutMapping("/Clase_Comprobante")
	public Clase_Comprobante modificar(@RequestBody Clase_Comprobante per) {
		return service.modificar(per);
	}
	
	/*Este método se hará cuando por una petición DELETE (como indica la anotación) se llame a la url + id del usuario
    http://127.0.0.1:8080/api/users/1  */
	@DeleteMapping("/Clase_Comprobante/{id}")
	public void eliminar(@PathVariable("id") Clase_Comprobante idClase_Comprobante) {
		service.eliminar(idClase_Comprobante);
	}
}
