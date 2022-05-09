package com.capsof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capsof.entity.OrdenCompraCabecera;
import com.capsof.repo.IOrdenCompraCabeceraRepo;
import com.capsof.service.IOrdenCompraCabeceraService;
@Service
public class OrdenCompraCabeceraImpl extends CRUDImpl<OrdenCompraCabecera, Integer> implements IOrdenCompraCabeceraService{

	@Autowired
	private  IOrdenCompraCabeceraRepo repo;
	@Override
	protected JpaRepository<OrdenCompraCabecera, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	
	@Override
	public Optional<OrdenCompraCabecera> leer(OrdenCompraCabecera t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_occ());
	}

}
