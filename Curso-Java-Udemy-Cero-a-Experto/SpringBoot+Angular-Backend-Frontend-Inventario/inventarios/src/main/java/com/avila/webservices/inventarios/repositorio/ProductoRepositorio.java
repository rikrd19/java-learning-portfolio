package com.avila.webservices.inventarios.repositorio;


import com.avila.webservices.inventarios.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {

}
