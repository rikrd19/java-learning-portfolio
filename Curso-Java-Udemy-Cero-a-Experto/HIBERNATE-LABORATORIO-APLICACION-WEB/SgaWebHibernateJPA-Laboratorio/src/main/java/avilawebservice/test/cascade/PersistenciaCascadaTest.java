package avilawebservice.test.cascade;

import avilawebservice.domain.Alumno;
import avilawebservice.domain.Contacto;
import avilawebservice.domain.Domicilio;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class PersistenciaCascadaTest {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        Domicilio domicilio = new Domicilio();
        domicilio.setCalle("Nogales");
        domicilio.setNoCalle("10");
        domicilio.setPais("Republica Dominicana");

        Contacto contacto = new Contacto();
        contacto.setEmail("cgomez@mail.com");
        contacto.setTelefono("34343434");

        Alumno alumno = new Alumno();
        alumno.setNombre("Carlos");
        alumno.setApellido("Gomez");
        alumno.setDomicilio(domicilio);
        alumno.setContacto(contacto);

        em.getTransaction().begin();
        em.persist(alumno);
        em.getTransaction().commit();

        System.out.println("alumno = " + alumno);

    }
}
