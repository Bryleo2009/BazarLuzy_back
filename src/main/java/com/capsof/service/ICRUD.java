package com.capsof.service;

import java.util.List;
import java.util.Optional;


public interface ICRUD<T> {

	T registrar(T t);
	T modificar(T t);
	Optional<T> leer(T t);
	List<T> listar();
	void eliminar(T t);
	
}
