package avilawebservice.ciclovida;

import avilawebservice.domain.Contacto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Estado3ModificarObjetoPersistente {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //definimos la variable
        Contacto contacto = null;

        // Recuperar un objeto de la base de datos 
        // 1. Transitivo
        contacto = em.find(Contacto.class, 5);
        
        em.getTransaction().begin();  // se recupera el contacto antes 

        //  modificamos el objeto
        contacto.setEmail("clara@mail.com");

        // 2. persistente
//        em.persist(contacto);
        em.merge(contacto);
        
        em.getTransaction().commit();  // se guarda el contacto despues

        // 3. detached
        System.out.println("Contacto: " + contacto);
    }
}