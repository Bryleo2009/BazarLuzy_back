package com.capsof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capsof.entity.FlujoCaja;
import com.capsof.repo.IFlujoCajaRepo;
import com.capsof.service.IFlujoCajaService;

@Service
public class FlujoCajaImpl extends CRUDImpl<FlujoCaja, Integer> implements IFlujoCajaService{

	@Autowired
	private IFlujoCajaRepo repo;
	@Override
	protected JpaRepository<FlujoCaja, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}

	@Override
	public Optional<FlujoCaja> leer(FlujoCaja t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_fc());
	}
}
