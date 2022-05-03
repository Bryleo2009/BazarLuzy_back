package com.ofsystem.capsofbackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofsystem.capsofbackend.entity.Clase_Comprobante;
import com.ofsystem.capsofbackend.repo.IComprobante;
import com.ofsystem.capsofbackend.service.IComprobanteService;

@Service
public class ComprobanteServiceImpl implements IComprobanteService{

	@Autowired
	public IComprobante repo;
	@Override
	public Clase_Comprobante registrar(Clase_Comprobante t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Clase_Comprobante modificar(Clase_Comprobante t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Optional<Clase_Comprobante> leer(Clase_Comprobante t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_cp());
	}

	@Override
	public List<Clase_Comprobante> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminar(Clase_Comprobante t) {
		// TODO Auto-generated method stub
		repo.delete(t);
	}
    
}
