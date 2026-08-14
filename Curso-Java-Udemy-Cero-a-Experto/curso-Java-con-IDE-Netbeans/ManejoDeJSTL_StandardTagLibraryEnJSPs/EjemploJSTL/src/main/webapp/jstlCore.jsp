<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSTL core</title>
    </head>
    <body>
        <h1>JSTL core</h1>
        <!--Manipulacion de variables-->
        <c:set var="nombre" value="Ernesto"/>
        Variable nombre: <c:out value="${nombre}" />
        <br/>

        <!-- Variable con Codigo HTML -->
        <c:out value="<h4>Hola</h4>" escapeXml="false" />

        <!--Codigo condicional con if-->
        <c:set var="bandera" value="true" />
        <c:if test="${bandera}">
            La bandera es verdadera
        </c:if>
        <br/>

        <!--Estructura switch con c:choose--> 
        <c:if test="${param.opcion != null}" >
            <c:choose>
                <c:when test="${param.opciom == 1}">
                    opcion 1 seleccionada
                </c:when>
                <c:when test="${param.opcion == 2}" >
                    opcion 2 seleccionada
                </c:when>
                <c:otherwise>
                    Opcion desconocida: ${param.opcion}
                </c:otherwise>
            </c:choose>
        </c:if> 
        <br/><br/>
        
        <!--Iteracion de un Arreglo-->
        <%
            String[] nombres = {"Claudia", "Rosa", "Pedro", "Juan"};
            request.setAttribute("nombres", nombres);
        %>

        Lista de usuarios:
        <ul>
            <c:forEach var="persona" items="${nombres}">
                <li>${persona}</li>
                </c:forEach>
        </ul>
        <br/>
        <a href="index.jsp">Regresar al Inicio</a>
    </body>
</html>