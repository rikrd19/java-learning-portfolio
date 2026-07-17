package avilawebservice.ciclovidajpa;


import avilawebservice.domain.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class PersistirObjetoJPA {
 
   private static  Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        // Inicia la transaccion
        
        // Paso 1. Crea nuevo Objeto
        // El objeto esta en estado Transitivo
        Persona persona1 = new Persona("Teresa", "Conca", "concate@mail.com", "242575765");
        
        //Paso 2. Inicia transaccion
        tx.begin();
        
        // Paso 3. Ejecura SQL
        em.persist(persona1);
        
        // Paso 4. commit/rollback
        tx.commit();
        
        // Objeto en estado detached
        log.debug("Objeto persistido - estado detached: "+ persona1);
        
        // Cerramos el entity manager
        em.close();
    }
    
    
    
}