<%-- 
    Document   : scriplets
    Created on : Jul 1, 2026, 7:59:47?AM
    Author     : ricardoavila
--%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP con Scriplets</title>
    </head>
    <body>
        <h1>JSP con Scriplets!</h1>
        <br/>
        <!--Scriplets para enviar informacion al navegador-->
        <%
            out.println("Saludos desde un Scriplet");
        %>
        <br/>
        <!--Scriplet para acceder a los objetos implicitos-->
        <%
            String nombreAplicacion = request.getContextPath();
            out.println("Nombre de la aplicacion: " + nombreAplicacion);
        %>
        <!--Scriplet con codigo condicionado-->
        <%
            if (session != null && session.isNew()) {
        %>
        <br/>
        La sesión SI es nueva
        <%
            }else if(session != null ){
        %>
         <br/>
        La sesion NO es nueva
        <% 
            }
        %>
        <br/><br/>
        <a href="index.html">Regresar al inicio</a>
    </body>
</html>
