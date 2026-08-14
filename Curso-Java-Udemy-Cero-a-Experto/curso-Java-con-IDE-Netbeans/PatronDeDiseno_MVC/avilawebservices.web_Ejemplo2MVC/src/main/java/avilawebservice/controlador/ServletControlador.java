package avilawebservice.controlador;

import avilawebservice.modelo.Rectangulo;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import java.io.IOException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

/**
 *
 * @author ricardoavila
 */
@WebServlet(name = "ServletControlador", urlPatterns = {"/ServletControlador"})
public class ServletControlador extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        // 1. Procesamos parámetros
        String accion = request.getParameter("accion");

        // 2. Creamos las clases de modelos los JavaBean a algun alcance (clases de modelos)
        Rectangulo rectanguloRequest = new Rectangulo(1, 2);
        Rectangulo rectanguloSession = new Rectangulo(3, 4);
        Rectangulo rectanguloApplication = new Rectangulo(5, 6);

        // 3. Agregamos el JavaBean a algun alcance (request, session, application)
        if ("agregarVariables".equals(accion)) {
            // Alcance request
            request.setAttribute("rectaguloRequest", rectanguloRequest);
            // Alcance session
            HttpSession sesion = request.getSession();
            sesion.setAttribute("rectanguloSession", rectanguloSession);
            // Alcance  Application
            ServletContext application = this.getServletContext();
            application.setAttribute("rectanguloApplication", rectanguloApplication);

            // Agregamos un mensaje 
            request.setAttribute("mensaje", "Las variables fueron agregadas");

            // 4. Redireccionamos al jsp de index
            request.getRequestDispatcher("index.jsp").forward(request, response);
        } else if ("listarVariables".equals(accion)) {
            // Redirigimos al jsp que despliega las variables
            request.getRequestDispatcher("WEB-INF/alcanceVariables.jsp").forward(request, response);
        } else {
            // En caso de que el parametro de accion no haya sido ni listar variables ni listar variables
            // Redirige a la pagina de inicio
            request.setAttribute("mensaje", "Accion no proporcionada o desconocida");
            request.getRequestDispatcher("index.jsp").forward(request, response);
            request.getRequestDispatcher("index.jsp").forward(request, response);

        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
