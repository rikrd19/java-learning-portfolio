package avilawevservice.test;

import avilawebservices.domain.Persona;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.client.authentication.HttpAuthenticationFeature;



public class PruebaRestWS {
    
    public static void main(String[] args) {
        
        HttpAuthenticationFeature feature = HttpAuthenticationFeature.basicBuilder().nonPreemptive().credentials("admin", "admin").build();
        
        ClientConfig clientConfig = new ClientConfig();
        clientConfig.register(feature);
        
        Client cliente = ClientBuilder.newClient(clientConfig);
        
        WebTarget webTarget = cliente.target("http://localhost:8080/Sga-Jee-Web-Seguridad-en-JakartaEE-1.0/webservice").path("/personas");
        // Proporcionamos un idPersona valido
        Persona persona = webTarget.path("/3").request(MediaType.APPLICATION_XML).get(Persona.class);
        System.out.println("Persona Recuperada: "+persona);
        
    }
}
