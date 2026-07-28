package avilawebservice.servicio;

import java.util.List;
import avilawebservice.domain.Persona;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;

@WebService
public interface PersonaServiceWs {
    
    @WebMethod
    List<Persona> listarPersonas();
}
