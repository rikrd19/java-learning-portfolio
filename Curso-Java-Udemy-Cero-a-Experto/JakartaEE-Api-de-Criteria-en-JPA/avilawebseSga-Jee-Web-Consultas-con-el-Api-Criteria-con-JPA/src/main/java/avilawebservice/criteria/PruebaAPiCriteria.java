package avilawebservice.criteria;

import avilawebservice.domain.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;




public class PruebaAPiCriteria {
    
 private static Logger log = LogManager.getRootLogger();
 
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        
        // Declaracion de variables
        CriteriaBuilder cb = null;  // se declara null porque despues se instancia
        CriteriaQuery<Persona> criteriaQuery = null;
        Root<Persona> fromPersona = null;
        TypedQuery<Persona> query = null;
        Persona persona = null;
        List<Persona> personas = null;
        
        // Query utilizando el API de Criteria
        // 1. Consulta de todas las personas
        
       // Paso 1. El objeto EntityManager crea instancia CriteriaBuilder
       cb = em.getCriteriaBuilder();
        
       // Paso 2. Se crea un objeto CriteriaQuery
       criteriaQuery = cb.createQuery(Persona.class);
       
       // Paso 3. Creamos el objeto raiz de query
       fromPersona = criteriaQuery.from(Persona.class);
       
       // Paso 4. seleccionamos lo necesario del from
       criteriaQuery.select(fromPersona);
       
       // Paso 5. creamos el query typeSafe
       query = em.createQuery(criteriaQuery);
       
       // Paso 6. Ejecutamos la consulta
       personas = query.getResultList();
       
       mostrarPersonas(personas);
        
    }
    
    private static void mostrarPersonas(List<Persona> personas){
        for (Persona p : personas) {
            log.debug(p);
        }
    }
            
 
}
