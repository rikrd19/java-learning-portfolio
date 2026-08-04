package avilawebservice.web;

import avilawebservice.domain.Alumno;
import avilawebservice.servicio.ServicioAlumno;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.List;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        ServicioAlumno servicioAlumno = new ServicioAlumno();

        List<Alumno> alumnos = servicioAlumno.listarAlumnos();

        request.setAttribute("alumnos", alumnos);
        try {
            request.getRequestDispatcher("/WEB-INF/listarAlumnos.jsp").forward(request, response);

        } catch (Exception e) {
            e.printStackTrace(System.out);
        }

    }

}
