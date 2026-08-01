package avilawebservice.dao;

import avilawebservice.domain.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.Query;
import java.util.List;

public class PersonaDAO {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PersonaDAO() {
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();

    }

    public List<Persona> listar() {
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
//        personas.forEach(p -> System.out.println("p: " + p));
        return personas;
    }

    public void insertar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.persist(persona);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void modificar(Persona persona) {
        try {
            em.getTransaction().begin();
            em.merge(persona);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
//        finally {
//            if (em != null) {
//                em.close();  // se comenta para que no cierre el objeto em y poder seguir trabajando
//            }
    }

    public Persona buscarPersonaPorId(Persona p) {
        return em.find(Persona.class, p.getIdPersona());

    }
}
