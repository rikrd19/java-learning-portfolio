package avilawebservice.servicio;

import avilawebservice.domain.Persona;
import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import java.util.List;


@WebService
public interface PersonaServiceWs {
    
    @WebMethod
    public List<Persona> listarPersonas();
    
    
    
}


