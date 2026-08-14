package avilawebservice.web;

import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CarritoServlet", urlPatterns = {"/CarritoServlet"})
public class CarritoServlet extends HttpServlet {

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

        // Recuperamos el Objeto HttpSesion
        HttpSession sesion = request.getSession();

        // Recuperamos la lista de articulos de la sesion(si existe)
        List<String> articulos = (List<String>) sesion.getAttribute("articulos");

        // Verificamos si la lista de articulos ya existe 
        if (articulos == null) {
            // Si no existe, creamos la lista    
            articulos = new ArrayList<>();
            sesion.setAttribute("articulos", articulos);
        }

        //Procesamos el nuevo articulo ingresado
        String articuloNuevo = request.getParameter("articulo");
        
        // Verificamos y agregamos el articulo nuevo si es valido
        if(articuloNuevo != null && !articuloNuevo.trim().equals("")){
            articulos.add(articuloNuevo);
        }
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Carrito Compras</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Lista de articulos</h1>");
            out.println("<br/><ul>");
            // iteramos sobre la lista de articulos
            for(String articulo : articulos){
                out.print("<li>" + articulo + "</li>");
            }
            out.println("</ul><br/>");
            out.println("<a href='index.html'>Regresar al inicio</a>");
            out.println("</body>");
            out.println("</html>");
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
