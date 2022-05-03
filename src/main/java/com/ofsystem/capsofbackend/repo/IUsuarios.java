package com.ofsystem.capsofbackend.repo;

import com.ofsystem.capsofbackend.entity.Clase_Usuarios;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarios extends JpaRepository<Clase_Usuarios, Integer>{
    
}
