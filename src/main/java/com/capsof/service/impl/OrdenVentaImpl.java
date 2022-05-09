package com.capsof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capsof.entity.OrdenVenta;
import com.capsof.repo.IOrdenVentaRepo;
import com.capsof.service.IOrdenVentaService;

@Service
public class OrdenVentaImpl extends CRUDImpl<OrdenVenta, Integer> implements IOrdenVentaService {

	@Autowired
	private IOrdenVentaRepo repo;
	@Override
	protected JpaRepository<OrdenVenta, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	@Override
	public Optional<OrdenVenta> leer(OrdenVenta t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_ov());
	}

}
