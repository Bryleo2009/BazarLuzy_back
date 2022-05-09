package com.capsof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import com.capsof.entity.Usuario;
import com.capsof.repo.IUsuarioRepo;
import com.capsof.service.IUsuarioService;

@Service
public class UsuarioImpl extends CRUDImpl<Usuario, Integer> implements IUsuarioService{

	@Autowired
	private IUsuarioRepo repo;
	@Override
	protected JpaRepository<Usuario, Integer> getRepo() {
		// TODO Auto-generated method stub
		return repo;
	}
	@Override
	public Optional<Usuario> leer(Usuario t) {
		// TODO Auto-generated method stub
		return repo.findById(t.getId_usuario());
	}

}
