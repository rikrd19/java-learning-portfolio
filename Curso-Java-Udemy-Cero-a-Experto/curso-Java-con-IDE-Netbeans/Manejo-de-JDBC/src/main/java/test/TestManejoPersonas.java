package test;

import com.avilawebservices.datos.Conexion;
import com.avilawebservices.datos.PersonaDAO;
import com.avilawebservices.domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.*;

public class TestManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            // connexion se instancia dentro pero se declara fuera
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaDAO personaDao = new PersonaDAO(conexion);

            Persona cambioPersona = new Persona();
            cambioPersona.setId_persona(2);
            cambioPersona.setNombre("Karla Ivonne");
            cambioPersona.setApellido("Gomez");
            cambioPersona.setEmail("kgomez@gmail.com");
            cambioPersona.setTelefono("7564454546");
            personaDao.actualizar(cambioPersona);

            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Carlos");
            //nuevaPersona.setApellido("Ramirez111111111122ggggggfsgggdfgdgfdfgdfgdfgdfgdfdgdfgdfgdfgdfgdfgdfgfgdfgdfgdfgdfgdgfdf");
            nuevaPersona.setApellido("Ramirez");
            personaDao.insertar(nuevaPersona);

            //Si todo funciona se hace commit de la trasaccion
            // Al inicio se coloco autocommit = false
            conexion.commit();
            System.out.println("Se ha hecho commit de la trasaccion");

        } catch (SQLException e) {
            e.printStackTrace(System.out);
            // en caso de error se imprime 
            System.out.println("Entrando al rollback");
            try {
                conexion.rollback();
            } catch (SQLException e1) {
                e1.printStackTrace(System.out);
            }
        }
    }

}
