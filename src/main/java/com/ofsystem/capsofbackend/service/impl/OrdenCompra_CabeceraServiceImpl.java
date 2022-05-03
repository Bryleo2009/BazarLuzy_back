package com.ofsystem.capsofbackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofsystem.capsofbackend.entity.Clase_OrdenCompra_Cabecera;
import com.ofsystem.capsofbackend.repo.IOrdenCC;
import com.ofsystem.capsofbackend.service.IOrdenCCService;

@Service
public class OrdenCompra_CabeceraServiceImpl implements IOrdenCCService{

	@Autowired
	public IOrdenCC repo;
	@Override
	public Clase_OrdenCompra_Cabecera registrar(Clase_OrdenCompra_Cabecera t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Clase_OrdenCompra_Cabecera modificar(Clase_OrdenCompra_Cabecera t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Optional<Clase_OrdenCompra_Cabecera> leer(Clase_OrdenCompra_Cabecera t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_occ());
	}

	@Override
	public List<Clase_OrdenCompra_Cabecera> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminar(Clase_OrdenCompra_Cabecera t) {
		// TODO Auto-generated method stub
		repo.delete(t);
	}
    
}
