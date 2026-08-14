package avilawebservice.ciclovida;

import avilawebservice.domain.Contacto;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;



public class Estado2RecuperarObjetoPersistenete {
    
      public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //definimos la variable
        Contacto contacto = null;
        
        em.getTransaction().begin();  // se recupera el contacto antes 
        
       // Recuperar un objeto de la base de datos 
       contacto = em.find(Contacto.class, 5);
       
       em.getTransaction().commit();  // se guarda el contacto despues
        
       // detached
          System.out.println("Contacto: "+contacto);
    }
}
