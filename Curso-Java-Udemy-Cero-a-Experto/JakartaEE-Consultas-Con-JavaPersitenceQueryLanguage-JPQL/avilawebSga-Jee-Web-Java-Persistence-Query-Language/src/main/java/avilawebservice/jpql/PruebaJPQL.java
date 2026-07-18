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
        mostrarPersonas(personas);
       
      
    }

    private static void mostrarPersonas(List<Persona> personas) {
        for (Persona p : personas) {
            log.debug(p);
        }

    }
}
