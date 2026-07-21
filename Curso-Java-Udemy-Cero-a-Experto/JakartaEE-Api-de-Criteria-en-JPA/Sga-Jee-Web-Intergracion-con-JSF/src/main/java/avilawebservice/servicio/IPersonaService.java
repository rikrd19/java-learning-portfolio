package avilawebservice.servicio;

import avilawebservice.domain.Persona;
import jakarta.ejb.Local;
import java.util.List;


@Local
public interface IPersonaService {
    
     public List<Persona> listarPersonas();

    public Persona encontrarPersonaPorId(Persona persona);

    public Persona encontrarPersonaPorEmail(Persona persona);

    public void registrarPersona(Persona persona);

    public void modificarPersona(Persona persona);

    public void eliminarPersona(Persona persona);

}
