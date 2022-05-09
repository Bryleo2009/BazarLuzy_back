package com.capsof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capsof.entity.Servicio;
import com.capsof.repo.IServicioRepo;
import com.capsof.service.IServicioService;

@Service
public class ServicioImpl extends CRUDImpl<Servicio, Integer> implements IServicioService{

	@Autowired
	private IServicioRepo repo;
	@Override
	protected JpaRepository<Servicio, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	@Override
	public Optional<Servicio> leer(Servicio t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_serv());
	}

}
