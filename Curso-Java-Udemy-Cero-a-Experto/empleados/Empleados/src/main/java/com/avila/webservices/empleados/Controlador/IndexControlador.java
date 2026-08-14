package com.avila.webservices.empleados.Controlador;

import com.avila.webservices.empleados.modelo.Empleado;
import com.avila.webservices.empleados.servicio.EmpleadosServicio;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.ConditionalOnRepositoryType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.List;

@Controller
public class IndexControlador {

    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

    @Autowired
    EmpleadosServicio empleadosServicio;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String iniciar(ModelMap modelo) {
        List<Empleado> empleados = empleadosServicio.listarEmpleados();
        empleados.forEach((empleado) -> logger.info(empleado.toString()));
        // Compartimos el modelo con la vista
        modelo.put("empleados", empleados);
        return "index";  //index.jsp
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.GET)
    public String mostrarAgregar() {
        return "agregar"; //agregar.jsp
    }

    @RequestMapping(value = "/agregar", method = RequestMethod.POST)
    public String agregar(@ModelAttribute("empleadoForma") Empleado empleado) {
        logger.info("Empleado a agregar: " + empleado);
        empleadosServicio.guardarEmpleado(empleado);
        return "redirect:/"; // redirige a la página de inicio (path "/"), para que se muestre el nuevo empleado agregado.
    }

    @RequestMapping(value ="/editar", method = RequestMethod.GET)
    public String mostrarEditar(@RequestParam int idEmpleado, ModelMap modelo){
        Empleado empleado = empleadosServicio.buscarEmpleadoPorId(idEmpleado);
        logger.info("Empleado a editar: " + empleado);
        modelo.put("empleado", empleado);
        return "editar";  // mostrar editar.jsp
    }

    @RequestMapping(value = "/editar", method = RequestMethod.POST)
    public String editar(@ModelAttribute("empleadoForma") Empleado empleado){
        logger.info("Empleado a guardar (editar): "+ empleado);
        empleadosServicio.guardarEmpleado(empleado);
        return "redirect:/"; // redirige al controlador "/", página de inicio (path "/"), para que se muestre el empleado editado.
    }


    @RequestMapping(value = "/eliminar", method = RequestMethod.GET)
    public String eliminar(@RequestParam int idEmpleado){
        Empleado empleado = new Empleado();
        empleado.setIdEmpleado(idEmpleado);
        empleadosServicio.eliminarEmpleado(empleado);
        return "redirect:/"; // redirige al inicio (path "/"), para que se muestre el empleado eliminado.

    }

}


