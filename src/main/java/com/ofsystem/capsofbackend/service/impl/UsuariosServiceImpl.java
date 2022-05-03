package com.ofsystem.capsofbackend.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofsystem.capsofbackend.entity.Clase_Usuarios;
import com.ofsystem.capsofbackend.repo.IUsuarios;
import com.ofsystem.capsofbackend.service.IUsuariosService;

@Service
public class UsuariosServiceImpl implements IUsuariosService{

	@Autowired
	public IUsuarios repo;
	@Override
	public Clase_Usuarios registrar(Clase_Usuarios t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Clase_Usuarios modificar(Clase_Usuarios t) {
		// TODO Auto-generated method stub
		return repo.save(t);
	}

	@Override
	public Optional<Clase_Usuarios> leer(Clase_Usuarios t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_usuario());
	}

	@Override
	public List<Clase_Usuarios> listar() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public void eliminar(Clase_Usuarios t) {
		// TODO Auto-generated method stub
		repo.delete(t);
	}
    
}
