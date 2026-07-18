package avilawebservice.cascade;

import avilawebservice.domain.Persona;
import avilawebservice.domain.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PersistenciaCascadaJpa {
    
    private static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        // Paso 1. Crea nuevo objeto
        // objeto en estado transitivo
        Persona persona1 = new Persona("Hugo", "Hernandez", "hhernandez", "232232329");
        
        // Paso 2. Crear objeto usuario (tiene dependencia con el objeto persona)
        Usuario usuario1 = new Usuario("hhernandez", "123", persona1);
        
        // Paso 3. Persistimos el objeto usuario unicamente (solo ese objeto)
        em.persist(usuario1);
        
        // Paso 4. commit transaccion
        tx.commit();
        
        // Objetos en estado datached
        log.debug("Objeto persistido persona: "+ persona1);
        log.debug("Objeto persistido usuario: "+ usuario1);
        
        em.close();
    }
    
}
