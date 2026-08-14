package avilawebservice.dao;

import avilawebservice.Persona;
import org.springframework.data.repository.CrudRepository;



public interface IPersonaDao extends CrudRepository<Persona, Long>{
    
   
}
