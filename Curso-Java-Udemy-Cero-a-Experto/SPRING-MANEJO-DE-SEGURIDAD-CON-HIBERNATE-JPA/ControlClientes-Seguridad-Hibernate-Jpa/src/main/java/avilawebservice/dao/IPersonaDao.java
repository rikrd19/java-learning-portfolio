package avilawebservice.dao;

import avilawebservice.domain.Persona;
import org.springframework.data.jpa.repository.JpaRepository;



public interface IPersonaDao extends JpaRepository<Persona, Long>{
    
   
}
