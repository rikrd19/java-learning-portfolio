<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejemplo de Inclusion Dinámica</title>
    </head>
    <body>
        <h1>Ejemplo de Inclusion Dinámica</h1>
        <br/>
        <!--Inclusión de un recurso público-->
        <jsp:include page="paginas/recursoPublico.jsp"/>
        <br/>
        <!--Inclusión de un recurso público-->
        <jsp:include page="WEB-INF/recursoPrivado.jsp">
            <jsp:param name="colorFondo"  value="pink" />
        </jsp:include>
    </body>
</html>

