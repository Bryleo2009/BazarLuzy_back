package com.ofsystem.capsofbackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofsystem.capsofbackend.entity.Clase_FlujoCaja;
import com.ofsystem.capsofbackend.repo.IFlujoDeCaja;
import com.ofsystem.capsofbackend.service.IFlujoDeCajaService;

@Service
public class FlujoDeCajaServiceImpl implements IFlujoDeCajaService{

	@Autowired
	public IFlujoDeCaja repo;

	@Override
	public Clase_FlujoCaja registrar(Clase_FlujoCaja t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Clase_FlujoCaja modificar(Clase_FlujoCaja t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Optional<Clase_FlujoCaja> leer(Clase_FlujoCaja t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_cp());
	}

	@Override
	public List<Clase_FlujoCaja> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminar(Clase_FlujoCaja t) {
		// TODO Auto-generated method stub
		repo.delete(t);
	}
	


    
}
