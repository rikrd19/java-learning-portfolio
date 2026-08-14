package avilawebservice.servicio;

import avilawebservice.domain.Persona;
import jakarta.ejb.Remote;
import java.util.List;

@Remote
public interface PersonaServiceRemote {

    List<Persona> listarPersonas();

    Persona encontrarPersonaPorId(Persona persona);

    Persona encontrarPersonaPorEmail(Persona persona);

    void registrarPersona(Persona persona);

    void modificarPersona(Persona persona);

    void eliminarPersona(Persona persona);

}
