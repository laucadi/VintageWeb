package com.vintage.vintage.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vintage.vintage.models.Producto;

public interface ProductoRepository extends JpaRepository<Producto,Long>{
    
}
