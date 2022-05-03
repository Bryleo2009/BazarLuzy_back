package com.ofsystem.capsofbackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofsystem.capsofbackend.entity.Clase_OrdenDeVenta;
import com.ofsystem.capsofbackend.repo.IOrdenDeVenta;
import com.ofsystem.capsofbackend.service.IOrdenDeVentaService;

@Service
public class OrdenDeVentaServiceImpl implements IOrdenDeVentaService{

	@Autowired
	public IOrdenDeVenta repo;
	@Override
	public Clase_OrdenDeVenta registrar(Clase_OrdenDeVenta t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Clase_OrdenDeVenta modificar(Clase_OrdenDeVenta t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Optional<Clase_OrdenDeVenta> leer(Clase_OrdenDeVenta t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_ov());
	}

	@Override
	public List<Clase_OrdenDeVenta> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminar(Clase_OrdenDeVenta t) {
		// TODO Auto-generated method stub
		repo.delete(t);
	}
    
}
