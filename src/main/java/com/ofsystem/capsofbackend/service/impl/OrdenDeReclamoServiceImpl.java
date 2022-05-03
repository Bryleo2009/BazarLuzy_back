package com.ofsystem.capsofbackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofsystem.capsofbackend.entity.Clase_OrdenDeReclamo;
import com.ofsystem.capsofbackend.repo.IOrdenDeReclamo;
import com.ofsystem.capsofbackend.service.IOrdenDeReclamoService;

@Service
public class OrdenDeReclamoServiceImpl implements IOrdenDeReclamoService{

	@Autowired
	public IOrdenDeReclamo repo;
	@Override
	public Clase_OrdenDeReclamo registrar(Clase_OrdenDeReclamo t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Clase_OrdenDeReclamo modificar(Clase_OrdenDeReclamo t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Optional<Clase_OrdenDeReclamo> leer(Clase_OrdenDeReclamo t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_or());
	}

	@Override
	public List<Clase_OrdenDeReclamo> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminar(Clase_OrdenDeReclamo t) {
		// TODO Auto-generated method stub
		repo.delete(t);
	}
    
}
