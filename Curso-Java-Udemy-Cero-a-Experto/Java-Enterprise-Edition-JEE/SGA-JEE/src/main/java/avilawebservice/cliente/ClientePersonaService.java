package avilawebservice.cliente;

import avilawebservice.domain.Persona;
import avilawebservice.servicio.PersonaServiceRemote;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClientePersonaService {

    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente\n");

        try {
            Context jndi = new InitialContext();
           PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/SGA-JEE/PersonaServiceImpl, java:global/SGA-JEE/PersonaServiceImpl!avilawebservice.servicio.PersonaServiceRemote");
            
           List<Persona> personas = personaService.listarPersonas();
            for (Persona persona : personas) {
                System.out.println(persona);
            }
            
             System.out.println("\nFin de llamada al EJB desde el cliente");
             
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }

    }

}
