package test;

import com.avilawebservices.datos.PersonaDAO;
import com.avilawebservices.domain.Persona;
import java.util.*;

public class TestManejoPersonas {

    public static void main(String[] args) {

        PersonaDAO personaDao = new PersonaDAO();

        // Insertando un nuevo objeto de tipo Persona
//        Persona personaNueva = new Persona("Carlos", "Esparza", "cesparza@mail.com", "232232323");
//        personaDao.insertar(personaNueva);

         // Modificar un objeto de persona existente
         Persona personaModificar = new Persona(4, "Marcos Junior", "Leyva","lmacos@gmail.com", "85475425743");
         personaDao.actualizar(personaModificar);
        
        // Eliminar un registro 
        Persona personaEliminar = new Persona(8);
        personaDao.eliminar(personaEliminar);
        
        List<Persona> listaPersonas = personaDao.seleccionar();
//        for (Persona persona : listaPersonas) {
//            System.out.println("persona = " + persona);
//        }

        // igual a forEach pero con lambda
        listaPersonas.forEach(persona -> {
            System.out.println("persona = " + persona);
        });

    }
}