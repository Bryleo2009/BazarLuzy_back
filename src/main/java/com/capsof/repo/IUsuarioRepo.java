package com.capsof.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capsof.entity.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{

}
