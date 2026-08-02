package avilawebservice.test;

import avilawebservice.dao.AlumnoDAO;
import avilawebservice.dao.AsignacionDAO;
import avilawebservice.dao.ContactoDAO;
import avilawebservice.dao.CursoDAO;
import avilawebservice.dao.DomicilioDAO;
import java.util.List;



public class TestDAO {
    
    public static void main(String[] args) {
        
        AlumnoDAO alumnoDAO = new AlumnoDAO();
        System.out.println("Alumnos:");
        imprimir(alumnoDAO.listar());
        
        System.out.println("\nDomicilios: ");
        DomicilioDAO domicilioDAO = new DomicilioDAO();
        imprimir(domicilioDAO.listar());
        
         System.out.println("\nContactos: ");
        ContactoDAO contactoDAO = new ContactoDAO();
        imprimir(contactoDAO.listar());
        
         System.out.println("\nCursos: ");
        CursoDAO cursoDAO = new CursoDAO();
        imprimir(cursoDAO.listar());
        
        System.out.println("\nAsignaciones: ");
        AsignacionDAO asignacionDAO = new AsignacionDAO();
        imprimir(asignacionDAO.listar());
        
    }
    
    private static void imprimir(List colleccion){
        for(Object o : colleccion){
            System.out.println("valor = "+ o);
        }
    }
}
