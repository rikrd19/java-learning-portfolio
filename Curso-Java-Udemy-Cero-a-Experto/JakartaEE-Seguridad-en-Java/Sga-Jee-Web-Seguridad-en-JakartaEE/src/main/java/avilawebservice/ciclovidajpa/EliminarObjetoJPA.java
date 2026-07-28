package avilawebservice.ciclovidajpa;

import avilawebservice.domain.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class EliminarObjetoJPA {

    private static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        // Inicia la transaccion
        // Paso 1. Iniciar una transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        // Paso 2. Ejecutar SQL de tipo select
        // El id proporcionado debe exitir en la base de datos
        Persona persona1 = em.find(Persona.class, 12);

        // Paso 3. termina la transaccion 1
        tx.commit();

        // Objeto en estado de datached
        log.debug("Objeto encontrado: " + persona1);

        // Paso 4. Inicia transaccion 2
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();

        // Paso 5. Ejecuta transaccion que es un Delete
        em.remove(em.merge(persona1)); // primero sicroniza el objeto persona con el estado de la BD y luego hace el delete

        // Paso 6. temina Transaccion 2
        tx2.commit();
        // Objeto en estado de datached ya modificado
        log.debug("Objeto eliminado: " + persona1);

        // Cerramos el entity manager
        em.close();

    }
}