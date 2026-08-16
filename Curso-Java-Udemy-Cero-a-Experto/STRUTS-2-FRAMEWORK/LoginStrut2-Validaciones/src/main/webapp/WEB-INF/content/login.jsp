<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <s:text name="form.titulo" />
        </title>
        <!--se agrega etiqueta para que se agreguen los estilos css de manejo de struts automaticamente-->
            <s:head/>
    </head>
    <body>
        <h1>
            <s:text name="form.titulo" />
        </h1>
            <!--para agregar los mensaje con action error se van a desplegar con la etiqueta-->
            <s:actionerror/>
        
        <s:form action="validarUsuario">
            <s:textfield key="form.usuario" name="usuario" value="Usuario"/>
            <s:password key="form.password" name="password" value="Password" />
            <s:submit key="form.boton" name="submit" value="Enviar"/> 
        </s:form>
    </body>
</html>
