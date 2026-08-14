<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>EL y Variables Implicitas</title>
    </head>
    <body>
        <h1>EL y Variables Implicitas</h1>
        <ul>
            <li>Nombre de la aplicacion: ${pageContext.request.contextPath}</li>
            <br/>
            <li>Navegador del Cliente: ${header["User-Agent"]}</li>
            <br/>
            <li>ID Sesión: ${cookie.JSESSIONID.value}</li>
             <br/>
             <li>Web Server: ${pageContext.servletContext.serverInfo}</li>
         <br/>
         <li>Valor parámetro: ${param.usuario}</li>
        </ul>
    </body>
</html>
