<%-- 
    Document   : procesaFormulario
    Created on : Jul 1, 2026, 6:57:27?AM
    Author     : ricardoavila
--%>

<%--<%@page contentType="text/html" pageEncoding="UTF-8"%>--%> 
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Procesa Formulario</title>
    </head>
    <body>
        <h1>Resultado de Procesar Formulario!</h1>
        Usuario: <%= request.getParameter("usuario") %>
        <br/>
        Password: <%= request.getParameter("password") %>
        <br/><br/>
        <a href="index.html" >Regresar al inicio</a>
    </body>
</html>
