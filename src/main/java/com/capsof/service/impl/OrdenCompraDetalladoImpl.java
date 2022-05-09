package com.capsof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capsof.entity.OrdenCompraDetallado;
import com.capsof.repo.IOrdenCompraDetalladoRepo;
import com.capsof.service.IOrdenCompraDetalladoService;

@Service
public class OrdenCompraDetalladoImpl extends CRUDImpl<OrdenCompraDetallado, Integer> implements IOrdenCompraDetalladoService{

	@Autowired
	private IOrdenCompraDetalladoRepo repo;
	@Override
	protected JpaRepository<OrdenCompraDetallado, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	

	@Override
	public Optional<OrdenCompraDetallado> leer(OrdenCompraDetallado t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_ocd());
	}

}
