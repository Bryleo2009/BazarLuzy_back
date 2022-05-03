package com.ofsystem.capsofbackend.repo;

import com.ofsystem.capsofbackend.entity.Clase_OrdenCompra_Detallado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdenCD extends JpaRepository<Clase_OrdenCompra_Detallado, Integer>{
    
}
