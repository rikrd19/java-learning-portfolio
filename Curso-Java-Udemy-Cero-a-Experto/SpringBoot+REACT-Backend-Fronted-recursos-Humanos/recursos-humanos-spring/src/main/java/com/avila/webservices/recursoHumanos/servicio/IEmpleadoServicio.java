package com.avila.webservices.recursoHumanos.servicio;

import com.avila.webservices.recursoHumanos.modelo.Empleado;

import java.util.List;

public interface IEmpleadoServicio {
    public List<Empleado> listarEmpleados();

    public Empleado buscarEmpleadoPorId(Integer idEmpleado);

    public Empleado guardarEmpleado(Empleado empleado);

    public void eliminarEmpleado(Empleado empleado);
}
