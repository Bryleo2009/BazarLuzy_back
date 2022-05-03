package com.ofsystem.capsofbackend.repo;

import com.ofsystem.capsofbackend.entity.Clase_OrdenCompra_Cabecera;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IOrdenCC extends JpaRepository<Clase_OrdenCompra_Cabecera, Integer>{
    
}
