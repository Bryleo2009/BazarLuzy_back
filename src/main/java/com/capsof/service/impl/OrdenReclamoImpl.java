package com.capsof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capsof.entity.OrdenReclamo;
import com.capsof.repo.IOrdenReclamoRepo;
import com.capsof.service.IOrdenReclamoService;

@Service
public class OrdenReclamoImpl extends CRUDImpl<OrdenReclamo, Integer> implements IOrdenReclamoService{

	@Autowired
	private IOrdenReclamoRepo repo;
	@Override
	protected JpaRepository<OrdenReclamo, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	@Override
	public Optional<OrdenReclamo> leer(OrdenReclamo t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_or());
	}

}
