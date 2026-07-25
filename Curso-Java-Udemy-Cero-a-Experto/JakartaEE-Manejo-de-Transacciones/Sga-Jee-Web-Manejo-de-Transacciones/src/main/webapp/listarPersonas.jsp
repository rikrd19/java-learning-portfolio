 <!--nueva taglib de jakarta reemplaza al uri="http://java.sun.com/jsp/jstl/core " -->
<%@taglib uri="jakarta.tags.core" prefix="c" %>   
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Listado de Personas</title>
    </head>
    <body>
        <h1>Listado de Personas</h1>
        <ul>
            <c:forEach items="${personas}" var="persona">
                <li>${persona.nombre} ${persona.apellido}</li>
            </c:forEach>
        </ul>
    </body>
</html>
