package com.ofsystem.capsofbackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofsystem.capsofbackend.entity.Clase_OrdenCompra_Detallado;
import com.ofsystem.capsofbackend.repo.IOrdenCD;
import com.ofsystem.capsofbackend.service.IOrdenCDService;

@Service
public class OrdenCompra_DetalladoServiceImpl implements IOrdenCDService{

	@Autowired
	public IOrdenCD repo;
	@Override
	public Clase_OrdenCompra_Detallado registrar(Clase_OrdenCompra_Detallado t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Clase_OrdenCompra_Detallado modificar(Clase_OrdenCompra_Detallado t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Optional<Clase_OrdenCompra_Detallado> leer(Clase_OrdenCompra_Detallado t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_ocd());
	}

	@Override
	public List<Clase_OrdenCompra_Detallado> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminar(Clase_OrdenCompra_Detallado t) {
		// TODO Auto-generated method stub
		repo.delete(t);
	}
    
}
