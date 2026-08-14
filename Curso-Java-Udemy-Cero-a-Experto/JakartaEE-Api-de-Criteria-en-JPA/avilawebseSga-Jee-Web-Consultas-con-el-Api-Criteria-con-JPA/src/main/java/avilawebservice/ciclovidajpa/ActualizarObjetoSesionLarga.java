package avilawebservice.ciclovidajpa;

import avilawebservice.domain.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class ActualizarObjetoSesionLarga {
    
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
        Persona persona1 = em.find(Persona.class, 1);

        log.debug("Objeto encontrado: "+ persona1);
        
        // Paso 3. setValue (nuevo valor)
        persona1.setEmail("juarez@mail.com");
        
        persona1.setEmail("j.juarez@mail.com");
        
        // Paso 4. Termina la transaccion
        tx.commit();  // como es la misma transaccion recuperada no hay necesidad de hacer un merge

        // Objeto en estado de datached
        log.debug("Objeto modificado: " + persona1);
        
        // Cerramos el entity manager
        em.close();
    }
}
