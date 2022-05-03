package com.ofsystem.capsofbackend.repo;

import com.ofsystem.capsofbackend.entity.Clase_OrdenDeVenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdenDeVenta extends JpaRepository<Clase_OrdenDeVenta, Integer>{
    
}
