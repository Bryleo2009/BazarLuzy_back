package com.ofsystem.capsofbackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofsystem.capsofbackend.entity.Clase_Producto;
import com.ofsystem.capsofbackend.repo.IProducto;
import com.ofsystem.capsofbackend.service.IProductoService;

@Service
public class ProductoServiceImpl implements IProductoService{

	@Autowired
	public IProducto repo;
	@Override
	public Clase_Producto registrar(Clase_Producto t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Clase_Producto modificar(Clase_Producto t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Optional<Clase_Producto> leer(Clase_Producto t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_producto());
	}

	@Override
	public List<Clase_Producto> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminar(Clase_Producto t) {
		// TODO Auto-generated method stub
		repo.delete(t);
	}
    
}
