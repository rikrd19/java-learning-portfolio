package avilawebservice.dao;

import avilawebservice.domain.Users;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UsersDao extends JpaRepository<Users, Long>{
    Optional<Users> findByUsername(String username);
    
}

