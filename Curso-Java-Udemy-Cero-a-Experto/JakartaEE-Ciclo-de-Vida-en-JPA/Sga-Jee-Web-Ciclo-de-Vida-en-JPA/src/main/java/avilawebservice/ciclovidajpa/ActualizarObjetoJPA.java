package avilawebservice.ciclovidajpa;

import avilawebservice.domain.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ActualizarObjetoJPA {

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
        Persona persona1 = em.find(Persona.class, 4);

        // Paso 3. termina la transaccion 1
        tx.commit();

        // Objeto en estado de datached
        log.debug("Objeto recuperado: " + persona1);

        // Paso 4. setValue (nuevo valor)
        persona1.setApellido("Juarez");

        // Paso 5. Inicia transaccion 2 
        EntityTransaction tx2 = em.getTransaction();
        tx2.begin();

        // Paso 6. Modificamos el Objeto
        em.merge(persona1);
        
        // ***** forzar el Update ahora mismo (antes del commit) *****
        // em.flush();    // <----- AQUI se ejecuta el UPDATE en BD

        // Paso 7. Termina la transaccion 2
        tx2.commit();
        
        // Objeto en estado de datached ya modificado
        log.debug("Objeto recuperado: "+ persona1);
        
        // Cerramos el entity manager
        em.close();
    }

}
