package avilawebservices.servicio;

import avilawebservice.dao.PersonaDAO;
import avilawebservice.domain.Persona;
import java.util.List;



public class ServicioPersonas {
    
    private PersonaDAO personaDAO;

    public ServicioPersonas(){
        this.personaDAO = new PersonaDAO();
    }  
    
    public List<Persona> listarPersonas(){
        return this.personaDAO.listar();
    }
}
 