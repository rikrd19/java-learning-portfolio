package avilawebservice.service;

import avilawebservice.dao.UsersDao;
import avilawebservice.domain.Rol;
import avilawebservice.domain.Users;
import java.util.ArrayList;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;



@Service("userDetailsService")
@Transactional(readOnly = true) 
@Slf4j
public class UsersService  implements UserDetailsService {
    
    @Autowired
    private UsersDao userDao;

    @Override
    @Transactional(readOnly = true) 
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Users usuario = userDao.findByUsername(username);
        
        if (usuario == null) {
            throw new UsernameNotFoundException(username);
        }
        
         List<GrantedAuthority> roles = new ArrayList<>();
        
         for (Rol rol : usuario.getRoles()) {
            roles.add(new SimpleGrantedAuthority(rol.getNombre()));
        }
         return new User(usuario.getUsername(),usuario.getPassword(), roles);
    }
    
}
