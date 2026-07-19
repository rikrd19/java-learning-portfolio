package avilawebservice.jpql;

import avilawebservice.domain.Persona;
import avilawebservice.domain.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PruebaJPQL {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        String jpql = null;
        Query q = null;
        List<Persona> personas = null;
        Persona persona = null;
        Iterator iter = null;
        Object[] tupla = null;
        List<String> nombres = null;
        List<Usuario> usuarios = null;

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        // Paso 1. Consulta de todos los objetos de tipo Persona
        log.debug("\n1. Consulta de todas las Personas");
        jpql = "select p from Persona p";
        personas = em.createQuery(jpql).getResultList();   // devuelve una lista de tipo persona
        // metodo de tipo persona encargado de iterar los tipos persona a recibir
        // mostrarPersonas(personas); se comenta para hacer la sgte Consulta

        // 2 consulta filtrandon una persona con la clave primaria Persona con id=1
        log.debug("\n2. Consulta de la Persona con id=1");
        jpql = "select p from Persona p where p.idPersona = 1";
        persona = (Persona) em.createQuery(jpql).getSingleResult();
       // log.debug(persona); se comenta para hacer la nueva sentencia
       
       // 3. Consulta de la persona por nombre
       jpql = "select p from Persona p where p.nombre='Karla'";
       personas = em.createQuery(jpql).getResultList();
      //  mostrarPersonas(personas);
       
      // 4. Consulta de datos individuales, se crea un arreglo(tupla) de tipo object de 3 columnas
      log.debug("\n4. Consulta de datos individuales se crea un arreglo(tupla) de tipo object de 3 columnas");
      jpql = "select p.nombre as Nombre, p.apellido as Apellido, p.email as Email from Persona p";
      iter = em.createQuery(jpql).getResultList().iterator();
        while (iter.hasNext()) {
            tupla = (Object[]) iter.next();
            String nombre = (String)tupla[0];
            String apellido = (String) tupla[1];
            String email = (String) tupla[2];
            log.debug("Nombre: {},Apellido: {}, Email: {}", nombre, apellido, email);
        }
        // Modern for-each form (do not reuse name "tupla": it is already declared above)
//        List<Object[]> resultados = em.createQuery(jpql, Object[].class).getResultList();
//        for (Object[] fila : resultados) {
//            String nombre = (String) fila[0];
//            String apellido = (String) fila[1];
//            String email = (String) fila[2];
//            log.debug("Nombre: {}, apellido: {}, email: {}", nombre, apellido, email);
//        }
        
      
    }

    private static void mostrarPersonas(List<Persona> personas) {
        for (Persona p : personas) {
            log.debug(p);
        }

    }
}
