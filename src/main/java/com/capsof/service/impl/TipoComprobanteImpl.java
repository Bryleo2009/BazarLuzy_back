package com.capsof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capsof.entity.TipoComprobante;
import com.capsof.repo.ITipoComprobanteRepo;
import com.capsof.service.ITipoComprobanteService;

@Service
public class TipoComprobanteImpl extends CRUDImpl<TipoComprobante, Integer> implements ITipoComprobanteService{

	@Autowired
	private ITipoComprobanteRepo repo;
	@Override
	protected JpaRepository<TipoComprobante, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	@Override
	public Optional<TipoComprobante> leer(TipoComprobante t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_tc());
	}

}
