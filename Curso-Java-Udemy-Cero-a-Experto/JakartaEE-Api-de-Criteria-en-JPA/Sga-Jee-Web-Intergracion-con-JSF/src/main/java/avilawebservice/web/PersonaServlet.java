package avilawebservice.web;

import avilawebservice.domain.Persona;
import avilawebservice.servicio.IPersonaService;
import jakarta.inject.Inject;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;



@WebServlet("/personas")
public class PersonaServlet extends HttpServlet{
    
    @Inject
    IPersonaService iPersonaService;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        
        List<Persona> personas = iPersonaService.listarPersonas();
        System.out.println("personas: "+ personas);
        request.setAttribute("personas", personas);
        request.getRequestDispatcher("/listarPersonas.jsp").forward(request, response);
        
        
    }
    
}

