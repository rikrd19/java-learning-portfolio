package avilawebservice.asociaciones;

import avilawebservice.domain.Persona;
import avilawebservice.domain.Usuario;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ClienteAsociacionesJPA {

    private static final Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();

        List<Persona> personas = em.createNamedQuery("Persona.findAll", Persona.class).getResultList();

        // Close the EntityManager before accessing associations
        // With FetchType.EAGER the usuarios are already loaded; with LAZY this would fail
        em.close();

        // Imprimir los objetos de tipo persona
        for (Persona persona : personas) {
            log.debug("Persona: " + persona);
            for (Usuario usuario : persona.getUsuarioList()) {
                log.debug("Usuario: " + usuario);
            }
        }
    }
}
