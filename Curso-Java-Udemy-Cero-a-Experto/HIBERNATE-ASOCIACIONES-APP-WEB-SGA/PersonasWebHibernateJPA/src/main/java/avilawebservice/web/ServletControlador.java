package avilawebservice.web;

import avilawebservice.domain.Persona;
import avilawebservice.servicio.ServicioPersonas;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        ServicioPersonas servicioPersonas = new ServicioPersonas();

        List<Persona> personas = servicioPersonas.listarPersonas();

        request.setAttribute("personas", personas);
        try {
            request.getRequestDispatcher("/WEB-INF/listado.jsp").forward(request, response);

        } catch (ServletException e) {
            e.printStackTrace(System.out);
        }catch(IOException e){
            e.printStackTrace(System.out);
        }

    }

}
