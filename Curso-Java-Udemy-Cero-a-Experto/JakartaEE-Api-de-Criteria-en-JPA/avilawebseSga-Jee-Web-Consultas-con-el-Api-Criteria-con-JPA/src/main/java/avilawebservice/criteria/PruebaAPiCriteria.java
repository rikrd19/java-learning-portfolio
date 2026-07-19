package avilawebservice.criteria;

import avilawebservice.domain.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.MapKeyJoinColumns;
import jakarta.persistence.Parameter;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.ParameterExpression;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import java.util.ArrayList;
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
//       mostrarPersonas(personas);

        // 2-a. Consulta de la Persona con id=1
        // jpql= "select p from Persona p where p.idPersona = 1";
        log.debug("\n\n2-a. Consulta de la Persona con id=1 ");
        cb = em.getCriteriaBuilder();
        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona).where(cb.equal(fromPersona.get("idPersona"), 1));
        persona = em.createQuery(criteriaQuery).getSingleResult();
        //log.debug(persona);

        // 2-b. Consulta de la Persona con id=1
        log.debug("\n\n2-b. Consulta de la Persona con id=1");
        cb = em.getCriteriaBuilder();
        criteriaQuery = cb.createQuery(Persona.class);
        fromPersona = criteriaQuery.from(Persona.class);
        criteriaQuery.select(fromPersona);

        // Clase Predicados
        // La clase 'Predicate' permite agregar varios criterios dinamicamente
        List<Predicate> criterios = new ArrayList<Predicate>();

        // Verificamos si tenemos criterios que agregar 
        Integer idPersonaParam = 1;
        ParameterExpression<Integer> parameter = cb.parameter(Integer.class, "idPersona");
        criterios.add( cb.equal(fromPersona.get("idPersona"), parameter ));

        // se agregan los criterios
        if (criterios.isEmpty()) {
            throw new RuntimeException("Sin criterios");
        } else if (criterios.size() == 1) {
            criteriaQuery.where(criterios.get(0));
        } else {
            criteriaQuery.where(cb.and(criterios.toArray(new Predicate[0])));
        }

        query = em.createQuery(criteriaQuery);
        query.setParameter("idPersona", idPersonaParam);
        
        // Se ejecuta el query
        persona = query.getSingleResult();
        log.debug(persona);
        
        
    }

    private static void mostrarPersonas(List<Persona> personas) {
        for (Persona p : personas) {
            log.debug(p);
        }
    }

}
