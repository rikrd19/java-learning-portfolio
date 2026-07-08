package com.avila.webservices.recursoHumanos.repositorio;

import com.avila.webservices.recursoHumanos.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {
}
