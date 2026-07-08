package com.avila.webservices.recursoHumanos.servicio;

import com.avila.webservices.recursoHumanos.modelo.Empleado;
import com.avila.webservices.recursoHumanos.repositorio.EmpleadoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service    // Esta clase es un servicio, es decir, contiene la lógica de negocio de la aplicación
public class EmpleadoServicio implements IEmpleadoServicio {

    @Autowired  // Inyecta el repositorio para poder usarlo en los métodos
    private EmpleadoRepositorio empleadoRepositorio;

    @Override
    public List<Empleado> listarEmpleados() {
        return empleadoRepositorio.findAll();
    }

    @Override
    public Empleado buscarEmpleadoPorId(Integer idEmpleado) {
        return empleadoRepositorio.findById(idEmpleado).orElse(null);
    }

    @Override
    public Empleado guardarEmpleado(Empleado empleado) {
        return empleadoRepositorio.save(empleado);
    }

    @Override
    public void eliminarEmpleado(Empleado empleado) {
        empleadoRepositorio.delete(empleado);
    }
}
