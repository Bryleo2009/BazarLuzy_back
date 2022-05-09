package com.capsof.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capsof.service.ICRUD;

public abstract class CRUDImpl<T,ID> implements ICRUD<T> {

	protected abstract JpaRepository<T, ID> getRepo();
	
	@Override
	public T registrar(T t) {
		// TODO Auto-generated method stub
		return getRepo().save(t);
	}

	@Override
	public T modificar(T t) {
		// TODO Auto-generated method stub
		return getRepo().save(t);
	}

	@Override
	public Optional<T> leer(T t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<T> listar() {
		// TODO Auto-generated method stub
		return getRepo().findAll();
	}

	@Override
	public void eliminar(T t) {
		// TODO Auto-generated method stub
		getRepo().delete(t);
	}

	
}
