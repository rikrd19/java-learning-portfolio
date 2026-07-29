package avilawevservice.test;

import avilawebservices.domain.Persona;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.Invocation;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.List;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;

public class TestPersonaServiceRS {

    //Variables que vamos a utilizar
    private static final String URL_BASE = "http://localhost:8080/Sga-Jee-Web-Seguridad-en-JakartaEE-1.0/webservice";
    private static Client cliente;
    private static WebTarget webTarget;
    private static Persona persona;
    private static List<Persona> personas;
    private static Invocation.Builder invocationBuilder;
    private static Response response;

    public static void main(String[] args) {
        
         HttpAuthenticationFeature feature = HttpAuthenticationFeature.basicBuilder().nonPreemptive().credentials("admin", "admin").build();
        
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.register(feature);
        
        cliente = ClientBuilder.newClient(clientConfig);

        //Leer una persona (metodo get)
        webTarget = cliente.target(URL_BASE).path("/personas");
        // Proporcionamos un idPersona valido
        persona = webTarget.path("/1").request(MediaType.APPLICATION_XML).get(Persona.class);
        System.out.println("Persona recuperada: " + persona);

        // Leer todas las personas (metodo get con readEntity de tipo List<>)
        personas = webTarget.request(MediaType.APPLICATION_XML)
                .get(Response.class)
                .readEntity(new GenericType<List<Persona>>() {
                });
        System.out.println("\nPersonas recuperadas");
        imprimirPersonas(personas);

        // Agregar una persona (metodo post)
        Persona nuevaPersona = new Persona();
        nuevaPersona.setNombre("Josefina");
        nuevaPersona.setApellido("Londono");
        nuevaPersona.setEmail("joselito@mail.com");
        nuevaPersona.setTelefono("322978745");

        invocationBuilder = webTarget.request(MediaType.APPLICATION_XML);
        response = invocationBuilder.post(Entity.entity(nuevaPersona, MediaType.APPLICATION_XML));
        System.out.println("");
        System.out.println(response.getStatus());
        // Recuperamos la personas recien agregadas para despues modificarlas y al final eliminarla
        Persona personaRecuperada = response.readEntity(Persona.class);
        System.out.println("Persona agregada: " + personaRecuperada);

        // Modificar la persona (Metodo PUT)
        // persona recuperada anteriormente
        Persona personaModificar = personaRecuperada;
        personaModificar.setApellido("Calcaterra");
        String pathId = "/"+ personaModificar.getIdPersona();
        invocationBuilder = webTarget.path(pathId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.put(Entity.entity(personaModificar, MediaType.APPLICATION_XML));
        
        System.out.println("");
        System.out.println("response: "+response.getStatus());
        System.out.println("Persona modificada: "+ response.readEntity(Persona.class));
        
        
        // Eliminar una persona
        // Persona recuperada anteriormente
        Persona personaEliminar = personaRecuperada;
        String pathEliminarId = "/"+personaEliminar.getIdPersona();
        invocationBuilder = webTarget.path(pathEliminarId).request(MediaType.APPLICATION_XML);
        response = invocationBuilder.delete();
        System.out.println("");
        System.out.println("response: "+ response.getStatus());
        System.out.println("Persona Eliminada:"+ personaEliminar);
        
    }

    private static void imprimirPersonas(List<Persona> personas) {
        for (Persona p : personas) {
            System.out.println("Personas: " + p);
        }

    }

}
