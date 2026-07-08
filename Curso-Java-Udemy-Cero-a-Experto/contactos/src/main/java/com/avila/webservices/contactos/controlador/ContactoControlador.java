package com.avila.webservices.contactos.controlador;


import com.avila.webservices.contactos.modelo.Contacto;
import com.avila.webservices.contactos.servicio.ContactoServicio;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class ContactoControlador {

    private static final Logger logger = LoggerFactory.getLogger(ContactoControlador.class);

    @Autowired
    ContactoServicio contactoServicio;

    @GetMapping("/")
    public String iniciar(ModelMap modelo) {
        List<Contacto> contactos = contactoServicio.listarContactos();
        contactos.forEach(contacto -> logger.info(contacto.toString()));
        modelo.put("contactos", contactos);
        return "index";  // Retorna el nombre de la plantilla Thymeleaf (index.html)
    }

    @GetMapping("/agregar")
    public String MostrarAgregar() {
        return "agregar";  // Retorna el nombre de la plantilla Thymeleaf (agregar.html)
    }

    @PostMapping("/agregar")
    public String agregar(@ModelAttribute("contactoForma") Contacto contacto) {
        logger.info("Contacto a agregar: " + contacto);
        contactoServicio.guardarContacto(contacto);
        return "redirect:/";  // Redirige al controlador de inicio  path "/" para mostrar la lista actualizada de contactos
    }

    @GetMapping("/editar/{id}")
    public String mostrarEditar(@PathVariable(value = "id") int idContacto, ModelMap modelo){
        Contacto contacto = contactoServicio.buscarContactoPorId(idContacto);
        logger.info("Contacto a editar (mostrar): " + contacto);
        modelo.put("contacto", contacto);
        return "editar";  // Retorna a editar.html de la plantilla Thymeleaf (editar.html)
    }

     @PostMapping("/editar")
    public String editar(@ModelAttribute("contacto") Contacto contacto){
        logger.info("Contacto a guardar (editar): " + contacto);
        contactoServicio.guardarContacto(contacto);
        return "redirect:/";  //
     }

     @GetMapping("/eliminar/{id}")
    public String eliminar(@PathVariable(value = "id") int idContacto){
        Contacto contacto = new Contacto();
        contacto.setIdContacto(idContacto);
        contactoServicio.eliminarContacto(contacto);
        return "redirect:/";  // Redirige al controlador de inicio path "/" para mostrar la lista actualizada de contactos
     }

}
