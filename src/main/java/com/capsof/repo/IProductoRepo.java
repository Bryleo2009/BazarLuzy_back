package com.capsof.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.capsof.entity.Producto;

public interface IProductoRepo extends JpaRepository<Producto, Integer>{

}
