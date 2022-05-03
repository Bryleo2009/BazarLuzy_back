package com.ofsystem.capsofbackend.repo;

import com.ofsystem.capsofbackend.entity.Clase_Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProducto extends JpaRepository<Clase_Producto, Integer>{
    
}
