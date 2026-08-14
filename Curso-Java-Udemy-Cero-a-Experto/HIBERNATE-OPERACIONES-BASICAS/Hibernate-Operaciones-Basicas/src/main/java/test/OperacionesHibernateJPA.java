package test;

import avilawebservice.dao.PersonaDAO;
import avilawebservice.domain.Persona;

public class OperacionesHibernateJPA {

    public static void main(String[] args) {
        PersonaDAO personaDAO = new PersonaDAO();
        personaDAO.listar();

        Persona persona = new Persona();
        persona.setIdPersona(35);
        
       persona = personaDAO.buscarPersonaPorId(persona);
        System.out.println("persona encontrada = "+persona);
        
//        persona.setNombre("Teodoro");
        persona.setApellido("Colorado");
        persona.setEmail("color@mail.com");
//        persona.setTelefono("64545474");
        
        //personaDAO.insertar(persona);

        
        
        personaDAO.modificar(persona);
        personaDAO.listar();
        
        
    }

}
