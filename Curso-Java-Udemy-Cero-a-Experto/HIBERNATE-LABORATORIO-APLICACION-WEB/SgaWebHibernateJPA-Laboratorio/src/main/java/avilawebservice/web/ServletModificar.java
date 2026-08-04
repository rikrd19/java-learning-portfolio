package avilawebservice.web;

import avilawebservice.domain.Alumno;
import avilawebservice.domain.Contacto;
import avilawebservice.domain.Domicilio;
import avilawebservice.servicio.ServicioAlumno;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String idAlumnoS = request.getParameter("idAlumno");
        Integer idAlumno = Integer.parseInt(idAlumnoS);

        Alumno alumno = new Alumno();
        alumno.setIdAlumno(idAlumno);

        ServicioAlumno servicioAlumno = new ServicioAlumno();
        alumno = servicioAlumno.encontrarAlumno(alumno);

//        request.setAttribute("alumno", alumno);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("alumno", alumno);

        request.getRequestDispatcher("/WEB-INF/modificarAlumno.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServicioAlumno servicioAlumno = new ServicioAlumno();  // se crea al inicio para no repertirla 
        
        String modificar = request.getParameter("Modificar");

        if (modificar != null) {

            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String calle = request.getParameter("calle");
            String noCalle = request.getParameter("noCalle");
            String pais = request.getParameter("pais");
            String email = request.getParameter("email");
            String telefono = request.getParameter("telefono");

            HttpSession sesion = request.getSession();
            Alumno alumno = (Alumno) sesion.getAttribute("alumno");

            alumno.setNombre(nombre);
            alumno.setApellido(apellido);
            alumno.getDomicilio().setCalle(calle);
            alumno.getDomicilio().setNoCalle(noCalle);
            alumno.getDomicilio().setPais(pais);
            alumno.getContacto().setEmail(email);
            alumno.getContacto().setTelefono(telefono);

            servicioAlumno.guardarAlumno(alumno);

            sesion.removeAttribute("alumno");

        } else {
            //caso eliminar
            String idAlumnoS = request.getParameter("idAlumno");
            Integer idAlumno = Integer.parseInt(idAlumnoS);
            Alumno alumno = new Alumno(idAlumno);
            
            servicioAlumno.eliminarAlumno(alumno);
        }
        request.getRequestDispatcher("/index.jsp").forward(request, response);

    }

}
