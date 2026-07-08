package test;

import com.avilawebservices.datos.UsuarioDAO;
import com.avilawebservices.domain.Usuario;
import java.util.List;



public class ManejoUsuarios {
     public static void main(String[] args){
         
         UsuarioDAO usuarioDao = new UsuarioDAO();
         
         // Ejecutando el listado de usuarios
         List<Usuario> usuarios = usuarioDao.seleccionar();
         for(Usuario usuario : usuarios){
             System.out.println("Usuarios; "+ usuario);
         }
         
         // Insertando un nuevo objeto de tipo Persona
      //  Usuario usuarioNuevo = new Usuario("Carlos Esparza", "2322");
       // usuarioDao.insertar(usuarioNuevo);
         
         
       // Modificar un objeto de persona existente
        // Usuario usuarioModificar = new Usuario(2, "Carlos Esparza", "456");
       //  usuarioDao.actualizar(usuarioModificar);
     
         // Eliminar un registro 
        Usuario usuarioEliminar = new Usuario(3);
        usuarioDao.eliminar(usuarioEliminar);
     
     
     //3️⃣ Listado DESPUÉS de actualizar
        System.out.println("\n=== USUARIOS DESPUÉS DE ACTUALIZAR ===");
        List<Usuario> usuariosActualizados = usuarioDao.seleccionar();
        for (Usuario usuario : usuariosActualizados) {
            System.out.println("Usuarios; " + usuario);
        }
     }
}


         // Modificar un objeto de persona existente
//         Persona personaModificar = new Persona(4, "Marcos Junior", "Leyva","lmacos@gmail.com", "85475425743");
//         personaDao.actualizar(personaModificar);
        
        // Eliminar un registro 
//        Persona personaEliminar = new Persona(8);
//        personaDao.eliminar(personaEliminar);
        
//       
        // igual a forEach pero con lambda
//        listaPersonas.forEach(persona -> {
//            System.out.println("persona = " + persona);
//        });