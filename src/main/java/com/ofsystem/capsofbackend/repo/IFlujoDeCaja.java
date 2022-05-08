package com.ofsystem.capsofbackend.repo;

import com.ofsystem.capsofbackend.entity.Clase_FlujoCaja;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFlujoDeCaja extends JpaRepository<Clase_FlujoCaja, Integer>{
    
}
