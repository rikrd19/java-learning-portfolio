package avilawebservice.servicio;

import avilawebservice.data.PersonaDao;
import avilawebservice.domain.Persona;
import jakarta.ejb.Stateless;
import jakarta.inject.Inject;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;
import java.util.List;

@Stateless
@Path("/personas")
public class PersonaServiceRS {

    @Inject
    private PersonaDao personaDao;

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    public List<Persona> listarPersonas() {
        List<Persona> personas = personaDao.encontrarTodasPersonas();
        System.out.println("personas encontradas: " + personas);
        return personas;
    }

    @GET
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}")  // hace referencia al path: /personas/{id}, ej. /personas/1
    public Persona encontrarPersona(@PathParam("id") int id) {
        Persona persona = personaDao.encontrarPersona(new Persona(id));
        System.out.println("persona encontrada: " + persona);
        return persona;
    }

    @POST
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    public Persona agregarPersona(Persona persona) {
        personaDao.insertarPersona(persona);
        System.out.println("persona agregada: " + persona);
        return persona;
    }

    @PUT
    @Consumes(value = MediaType.APPLICATION_JSON)
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response modificarPersona(@PathParam("id") int id, Persona personaModificada) {
        // 1. Recuperar la persona existente por ID
        Persona persona = personaDao.encontrarPersona(new Persona(id));
        
        if (persona != null) {
            
            personaDao.actualizarPersona(personaModificada);
            System.out.println("persona modificada: " + personaModificada);
            return Response.ok().entity(personaModificada).build();
        } else {
            return Response.status(Status.NOT_FOUND).build();
        }
    }

    @DELETE
    @Produces(value = MediaType.APPLICATION_JSON)
    @Path("{id}")
    public Response eliminarPersona(@PathParam("id") int id) {
        personaDao.eliminarPersona(new Persona(id));
        System.out.println("persona eliminada con el id: " + id);
        return Response.ok().build();
    }

}
