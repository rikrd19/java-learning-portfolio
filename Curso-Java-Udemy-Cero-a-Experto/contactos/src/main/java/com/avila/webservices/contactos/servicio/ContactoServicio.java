package com.avila.webservices.contactos.servicio;

import com.avila.webservices.contactos.modelo.Contacto;
import com.avila.webservices.contactos.repositorio.ContactoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactoServicio implements IContactoServicio {

    @Autowired
    private ContactoRepositorio contactoRepositorio;

    @Override
    public List<Contacto> listarContactos() {
        return contactoRepositorio.findAll();
    }

    @Override
    public Contacto buscarContactoPorId(Integer idContacto) {
       return contactoRepositorio.findById(idContacto).orElse(null);
    }

    @Override
    public void guardarContacto(Contacto contacto) {
        contactoRepositorio.save(contacto);

    }

    @Override
    public void eliminarContacto(Contacto contacto) {
        contactoRepositorio.delete(contacto);
    }
}
