package avilawebservice.servicio;


import java.util.List;
import jakarta.ejb.Remote;
import avilawebservice.domain.Usuario;

@Remote
public interface UsuarioServiceRemote {
    
    public List<Usuario> listarUsuarios();
    
    public Usuario encontrarUsuarioPorId(Usuario usuario);
    
    public void registrarUsuario(Usuario usuario);
    
    public void modificarUsuario(Usuario usuario);
    
    public void eliminarUsuario(Usuario usuario);
    
}
