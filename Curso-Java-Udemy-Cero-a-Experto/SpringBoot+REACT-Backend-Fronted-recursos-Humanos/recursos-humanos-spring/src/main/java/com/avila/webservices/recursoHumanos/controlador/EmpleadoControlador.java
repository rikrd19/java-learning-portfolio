package com.avila.webservices.recursoHumanos.controlador;

import com.avila.webservices.recursoHumanos.exepcion.RecursoNoEncontradoExepcion;
import com.avila.webservices.recursoHumanos.modelo.Empleado;
import com.avila.webservices.recursoHumanos.servicio.IEmpleadoServicio;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@RestController
// Esta clase es un controlador REST, es decir, maneja las solicitudes HTTP y devuelve respuestas HTTP(JSON, XML, etc.)
// http://localhost:8080/rh-app/
@RequestMapping("rh-app")
// Esta anotación Define un prefijo común para todos los métodos del controlador, comenzarán con "rh-app", es decir, http://localhost:8080/rh-app/empleados, http://localhost:8080/rh-app/empleados/{id}, etc.
@CrossOrigin(value = "http://localhost:3000")
@Slf4j
public class EmpleadoControlador {
    // private static final Logger log = LoggerFactory.getLogger(EmpleadoControlador.class);

    @Autowired   // Conexión automática" o "Inyección automática de dependencias"
    private IEmpleadoServicio empleadoServicio;

    // http://localhost:8080/rh-app/empleados
    @GetMapping("/empleados")
    // Esta anotación indica que este método manejará las solicitudes HTTP GET a la URL http://localhost:8080/rh-app/empleados
    public List<Empleado> obtenerEmpleados() {
        List<Empleado> empleados = empleadoServicio.listarEmpleados();
        empleados.forEach((empleado -> log.info(empleado.toString())));
        return empleados;
    }

    // ¿Qué verbo HTTP corresponde a "crear un nuevo recurso"?
    // Respuesta: POST (no GET, no PUT, no DELETE).
    @PostMapping("/empleados")
    public Empleado agregarEmpleado(@RequestBody Empleado empleado) {  //¿Dónde vienen los datos del empleado?= @RequestBody, En el cuerpo (body) de la petición HTTP, no en la URL.
        log.info("Empleado a agregar: " + empleado);
        return empleadoServicio.guardarEmpleado(empleado);
    }

    @GetMapping("/empleados/{id}")
    public ResponseEntity<Empleado> obtenerEmpleadoPorId(@PathVariable Integer id) {
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if (empleado == null) {
            throw new RecursoNoEncontradoExepcion("No se encontró el empleado con ID: " + id);
        }
        return ResponseEntity.ok(empleado);
    }

    @PutMapping("/empleados/{id}")
    public ResponseEntity<Empleado> actualizarEmpleado(@PathVariable Integer id,
                                                       @RequestBody Empleado empleadoRecibido){
        Empleado empleado= empleadoServicio.buscarEmpleadoPorId(id);
        if (empleado == null) {
            throw new RecursoNoEncontradoExepcion("El id recibido no existe: " + id);
        }
        empleado.setNombre(empleadoRecibido.getNombre());
        empleado.setDepartamento(empleadoRecibido.getDepartamento());
        empleado.setSueldo(empleadoRecibido.getSueldo());
        empleadoServicio.guardarEmpleado(empleado);
        return ResponseEntity.ok(empleado);
    }

    @DeleteMapping("/empleados/{id}")
    public ResponseEntity<Map<String, Boolean>> eliminarEmpleado(@PathVariable Integer id){
        Empleado empleado = empleadoServicio.buscarEmpleadoPorId(id);
        if(empleado == null){
            throw new RecursoNoEncontradoExepcion("El id recibido no existe: " + id);
        }
        empleadoServicio.eliminarEmpleado(empleado);
        // respuesta de tipo JSON: {"eliminar": true}
        Map<String, Boolean> respuesta = new HashMap<>();
        respuesta.put("eliminado", Boolean.TRUE);
        return ResponseEntity.ok(respuesta);
    }
}
