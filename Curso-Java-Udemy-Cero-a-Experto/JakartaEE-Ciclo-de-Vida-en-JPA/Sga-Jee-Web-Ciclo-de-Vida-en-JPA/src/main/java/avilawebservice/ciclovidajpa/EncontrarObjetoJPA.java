package avilawebservice.ciclovidajpa;

import avilawebservice.domain.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EncontrarObjetoJPA {

    private static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        // Inicia la transaccion
        // Paso 1. Iniciar una transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();
        
        // Paso 2. Ejecutar SQL de tipo select
        Persona persona1 = em.find(Persona.class, 15);

        // Paso 3. termina la transaccion
        tx.commit();
        
        // Objeto en estado de datached
        log.debug("Objeto recuperado: "+ persona1);

        // Cerramos el entity manager
        em.close();
    }
}
