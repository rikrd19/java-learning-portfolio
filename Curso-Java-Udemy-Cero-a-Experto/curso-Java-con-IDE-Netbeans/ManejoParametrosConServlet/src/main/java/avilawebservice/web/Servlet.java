package avilawebservice.web;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", urlPatterns = {"/Servlet"})
public class Servlet extends HttpServlet {

    // Processes requests for both HTTP <code>GET</code> and <code>POST</code>
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        //leemos los parametros del formulario
        String usuario = request.getParameter("usuario");
        String password = request.getParameter("password");

        // Obtener el PrintWriter para escribir la respuesta
        try (PrintWriter out = response.getWriter()) {
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Manejo Parametros desde el Servlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Parámetros recibidos</h1>");
            
            out.print("<p>El valor del parametro de usuario es: "+ usuario +"</p>");
            out.print("<p>El valor del parametro de password es: "+ password + "</p>");
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // Handles the HTTP <code>GET</code> method
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

    // Handles the HTTP <code>POST</code> method
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);

    }

}
