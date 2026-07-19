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
//      iter = em.createQuery(jpql).getResultList().iterator();
//        while (iter.hasNext()) {
//            tupla = (Object[]) iter.next();
//            String nombre = (String)tupla[0];
//            String apellido = (String) tupla[1];
//            String email = (String) tupla[2];
//            log.debug("nombre: " +nombre + ", apellido: "+ apellido + ", Email: "+ email);
//        }
        // Otra forma moderna de realizar con forEach
        List<Object[]> resultados = em.createQuery(jpql, Object[].class).getResultList();
        for (Object[] fila : resultados) {
            String nombre = (String) fila[0];
            String apellido = (String) fila[1];
            String email = (String) fila[2];
            //log.debug("Nombre: {}, apellido: {}, email: {}", nombre, apellido, email);
        }

        // 5. Obtiene el objeto Persona y el id, se crea un arreglo de tipo Object con 2 columnas
        log.debug("\n5. Obtiene el objeto Persona y el id, se crea un arreglo de tipo Object con 2 columnas");
        jpql = "select p, p.idPersona from Persona p";
//        iter = em.createQuery(jpql).getResultList().iterator();
//        while (iter.hasNext()) {
//            tupla = (Object[]) iter.next();
//            persona = (Persona) tupla[0];
//            int idPersona = (int) tupla[1];
//            log.debug("Objeto persona: " + persona);
//            log.debug("id persona: {}", idPersona);
//        }

        // otra foma con forEach
        List<Object[]> result = em.createQuery(jpql, Object[].class).getResultList();
        for (Object[] fila : result) {
            Persona persona1 = (Persona) fila[0];
            int idPersona = (int) fila[1];
//            log.debug("Objeto persona: {}", persona1);
//            log.debug("id persona: {}", idPersona);

        }

        // 6. Consulta de todas las personas, pero este objeto persona solo va a contener los demas valoreas
        // por default en este caso valores nulos, util para casos en los que se necesite los objetos con PK
        log.debug("\n 6. Consulta de todas las personas");
        jpql = "select new avilawebservice.domain.Persona( p.idPersona ) from Persona p";
        personas = em.createQuery(jpql).getResultList();
        mostrarPersonas(personas);

        // 7. Regresa el valor minimo y maximo del id Persona (scaler result)
        System.out.println("\n7. Regresa el valor minimo y maximo del id Persona (scaler result)");
        jpql = "select min(p.idPersona) as MinId, max(p.idPersona) as MaxId, count(p.idPersona) as Contador from Persona p";
//        iter = em.createQuery(jpql).getResultList().iterator();
//        while (iter.hasNext()) {
//            tupla = (Object[]) iter.next();
//            Integer idMin = (Integer) tupla[0];
//            Integer idMax = (Integer) tupla[1];
//            Long count = (Long) tupla[2];
//            log.debug("idMin: {}, idMax: {}, count: {}", idMin, idMax, count);
//        }

        // otra forma 
        List<Object[]> rsultList = em.createQuery(jpql, Object[].class).getResultList();
        for (Object[] fila : rsultList) {
            Integer idMin = (Integer) fila[0];
            Integer idMax = (Integer) fila[1];
            Long count = (Long) fila[2];
            log.debug("idMin: {}, idMax: {}, count: {}", idMin, idMax, count);

        }

    }

    private static void mostrarPersonas(List<Persona> personas) {
        for (Persona p : personas) {
            log.debug(p);
        }

    }
}
