package test;

import com.avilawebservices.datos.Conexion;
import com.avilawebservices.datos.PersonaDaoJDBC;
import com.avilawebservices.domain.PersonaDTO;
import java.sql.*;
import java.util.List;

public class ManejoPersonas {

    public static void main(String[] args) {

        Connection conexion = null;
        try {
            // connexion se instancia dentro pero se declara fuera
            conexion = Conexion.getConnection();
            if (conexion.getAutoCommit()) {
                conexion.setAutoCommit(false);
            }

            PersonaDaoJDBC personaDao = new PersonaDaoJDBC(conexion);

            List<PersonaDTO> personas = personaDao.select();
            
            for(PersonaDTO persona : personas){
                System.out.println("Persona DTO: "+ persona);
            } 
            
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
