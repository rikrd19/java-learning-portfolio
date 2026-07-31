package avilawebservice.test;

import avilawebservice.servicio.Persona;
import avilawebservice.servicio.PersonaServiceImplService;
import avilawebservice.servicio.PersonaServiceWs;
import jakarta.xml.ws.BindingProvider;
import java.util.List;

public class TestPersonaServiceWS {

    public static void main(String[] args) {
        PersonaServiceWs servicio = new PersonaServiceImplService().getPersonaServiceImplPort();

        BindingProvider proveedor = (BindingProvider) servicio;
        proveedor.getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "admin");
        proveedor.getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "admin");

        System.out.println("Ejecutando servicio listar personas...");
        List<Persona> personas = servicio.listarPersonas();

        personas.forEach(p -> System.out.println(
                "Id: " + p.getIdPersona() + ", nombre: " + p.getNombre()
                + ", apellido: " + p.getApellido() + ", email: " + p.getEmail()
        ));

        System.out.println("Fin del servicio");

        // OTRA FORMA (INLINE) NO recomendado al configurar multiples propiedades
//        PersonaServiceWs personaService = new PersonaServiceImplService().getPersonaServiceImplPort();
//
//        ((BindingProvider) personaService).getRequestContext().put(BindingProvider.USERNAME_PROPERTY, "admin");
//        ((BindingProvider) personaService).getRequestContext().put(BindingProvider.PASSWORD_PROPERTY, "admin");
//
//        System.out.println("Ejecutando servicio listar personas ws...");
//        List<Persona> personas = personaService.listarPersonas();
//
//        for(Persona persona : personas) {
//         System.out.println("Persona idPersona: " + persona.getIdPersona() + ", nombre: " + persona.getNombre()
//                + ", apellido: " + persona.getApellido() + ", email: " + persona.getEmail());
//        }
//        
//        System.out.println("Fin del servicio listar persona ws");
    }
}
