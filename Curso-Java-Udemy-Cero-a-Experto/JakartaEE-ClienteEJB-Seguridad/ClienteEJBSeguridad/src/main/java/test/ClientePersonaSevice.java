package test;

import avilawebservice.domain.Persona;
import avilawebservice.servicio.PersonaServiceRemote;
import com.sun.enterprise.security.ee.authentication.ProgrammaticLogin;
import java.util.List;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class ClientePersonaSevice {

    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB desde el cliente");

        String authFile = "login.conf";
        System.setProperty("java.security.auth.login.config",authFile);
        ProgrammaticLogin programmaticLogin = new ProgrammaticLogin();
        programmaticLogin.login("admin", "admin".toCharArray());

        try {
            Context jndi = new InitialContext();
            PersonaServiceRemote personaService = (PersonaServiceRemote) jndi.lookup("java:global/Sga-Jee-Web-Seguridad-en-JakartaEE-1.0/PersonaServiceImpl!avilawebservice.servicio.PersonaServiceRemote");
        
            List<Persona> personas = personaService.listarPersonas();
            
            for (Persona p : personas) {
                System.out.println(p);
            }
            System.out.println("\nFin llamada al EJB desde el cliente");
        
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
}