package com.avila.webservices.empleados.repositorio;

import com.avila.webservices.empleados.modelo.Empleado;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpleadoRepositorio extends JpaRepository<Empleado, Integer> {

}
