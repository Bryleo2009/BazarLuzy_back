package com.ofsystem.capsofbackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofsystem.capsofbackend.entity.Clase_Servicios;
import com.ofsystem.capsofbackend.repo.IServicios;
import com.ofsystem.capsofbackend.service.IServiciosService;

@Service
public class ServiciosServiceImpl implements IServiciosService{

	@Autowired
	public IServicios repo;
	@Override
	public Clase_Servicios registrar(Clase_Servicios t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Clase_Servicios modificar(Clase_Servicios t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Optional<Clase_Servicios> leer(Clase_Servicios t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_serv());
	}

	@Override
	public List<Clase_Servicios> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminar(Clase_Servicios t) {
		// TODO Auto-generated method stub
		repo.delete(t);
	}
    
}
