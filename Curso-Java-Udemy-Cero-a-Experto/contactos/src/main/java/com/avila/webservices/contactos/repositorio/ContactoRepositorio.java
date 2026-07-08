package com.avila.webservices.contactos.repositorio;


import com.avila.webservices.contactos.modelo.Contacto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactoRepositorio extends JpaRepository<Contacto, Integer> {

}
