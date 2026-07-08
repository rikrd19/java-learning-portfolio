package com.avila.webservices.empleados.servicio;

import com.avila.webservices.empleados.modelo.Empleado;
import com.avila.webservices.empleados.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class EmpleadosServicio implements IEmpleadoServicio {

    @Autowired
    private EmpleadoRepositorio empleadoRepositorio;


    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepositorio.findAll();
    }

    @Override
    public Empleado buscarEmpleadoPorId(Integer idEmpleado) {
        Empleado empleado = empleadoRepositorio.findById(idEmpleado).orElse(null);
        return empleado;

        // Podemos retornar en una solo línea, sin necesidad de crear una variable temporal:
        // return empleadoRepositorio.findById(idEmpleado).orElse(null);
    }

    @Override
    public void guardarEmpleado(Empleado empleado) {
        empleadoRepositorio.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleadoRepositorio.delete(empleado);
    }
}