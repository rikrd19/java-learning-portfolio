<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <s:text name="bienvenido.titulo"/>
        </title>
        <!--Etiqueta para que se agreguen los estilos CSS en struts-->
            <s:head/>
        
    </head>
    <body>
        <h1>
            <s:text name="bienvenido.titulo" />
        </h1
        <!--Etiqueta para que se desplieguen los mensajes en jsp --> 
        <s:actionmessage/>
        <s:actionerror/>
        
        <h2>
            <s:text name="bienvenido.mensaje" />  
        </h2>
        <br/>
        <s:text name="form.usuario"/>: <s:property value="usuario"/>
        <br/>
        <s:text name="form.password"/>: <s:property value="password"/>
            <br/>
            <a href="<s:url action="login"/>"><s:text name="bienvenido.regresar"/></a>
    </body>
</html>
