package com.capsof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capsof.entity.TipoPago;
import com.capsof.repo.ITipoPagoRepo;
import com.capsof.service.ITipoPagoService;

@Service
public class TipoPagoImpl extends CRUDImpl<TipoPago, Integer> implements ITipoPagoService{

	@Autowired
	private ITipoPagoRepo  repo;
	@Override
	protected JpaRepository<TipoPago, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
	@Override
	public Optional<TipoPago> leer(TipoPago t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_tp());
	}

}
