package avilawebservice.dao;

import avilawebservice.domain.Persona;
import org.springframework.data.repository.CrudRepository;



public interface IPersonaDao extends CrudRepository<Persona, Long>{
    
   
}
