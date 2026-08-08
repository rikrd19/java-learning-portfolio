package avilawebservice.dao;

import avilawebservice.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsersDao extends JpaRepository<Users, Long>{
    Users findByUsername(String username);
    
}

