package avilawebservice.servicio;

import avilawebservice.domain.Persona;
import jakarta.ejb.Local;
import java.util.List;


@Local
public interface IPersonaService {
    
     List<Persona> listarPersonas();

    Persona encontrarPersonaPorId(Persona persona);

    Persona encontrarPersonaPorEmail(Persona persona);

    void registrarPersona(Persona persona);

    void modificarPersona(Persona persona);

    void eliminarPersona(Persona persona);

}
