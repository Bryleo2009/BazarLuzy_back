package com.capsof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capsof.entity.Producto;
import com.capsof.repo.IProductoRepo;
import com.capsof.service.IProductoService;

@Service
public class ProductoImpl extends CRUDImpl<Producto, Integer> implements IProductoService{

	@Autowired
	private IProductoRepo repo;
	@Override
	protected JpaRepository<Producto, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
	@Override
	public Optional<Producto> leer(Producto t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_product());
	}
}
