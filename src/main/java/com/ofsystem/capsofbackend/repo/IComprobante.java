package com.ofsystem.capsofbackend.repo;

import com.ofsystem.capsofbackend.entity.Clase_Comprobante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IComprobante extends JpaRepository<Clase_Comprobante, Integer>{
    
}
