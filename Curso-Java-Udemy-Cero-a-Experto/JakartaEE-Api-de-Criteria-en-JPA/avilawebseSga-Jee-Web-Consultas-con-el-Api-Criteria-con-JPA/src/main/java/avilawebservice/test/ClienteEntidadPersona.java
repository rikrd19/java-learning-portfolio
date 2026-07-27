package avilawebservice.test;

import avilawebservice.domain.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClienteEntidadPersona {

    private static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SGAPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();

        // Inicia la Transaccion
        tx.begin();
        // No se debe especificar el ID de la base de datos 
        Persona persona1 = new Persona("Maria", "Gutierrez", "mgutierrez@mail.com", "343434442");
        log.debug("Objeto a persistir: "+ persona1);
        //Persistimos el objeto 
        em.persist(persona1);
        // Terminamos la transaccion
        tx.commit();
        log.debug("Objeto persistido "+ persona1);
        em.close();
    }
}
