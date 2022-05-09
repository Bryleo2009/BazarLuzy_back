package com.capsof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capsof.entity.ComprobantePago;
import com.capsof.repo.IComprobantePagoRepo;
import com.capsof.service.IComprobantePagoService;

@Service
public class ComprobantePagoImpl extends CRUDImpl<ComprobantePago, Integer> implements IComprobantePagoService{

	@Autowired
	private IComprobantePagoRepo repo;
	
	@Override
	protected JpaRepository<ComprobantePago, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
	@Override
	public Optional<ComprobantePago> leer(ComprobantePago t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_cp());
	}

}
