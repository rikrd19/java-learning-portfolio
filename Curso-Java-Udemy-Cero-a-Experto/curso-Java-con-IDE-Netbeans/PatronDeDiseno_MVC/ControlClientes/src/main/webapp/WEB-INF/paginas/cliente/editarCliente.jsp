<!doctype html>
<html data-bs-theme="dark">
    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Editar Cliente</title>
        <!--Bootstrap CSS-->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-sRIl4kxILFvY47J16cr9ZwB07vP4J8+LH7qKQnuqkuIAvNWLzeN8tE5YBujZqJLB" crossorigin="anonymous">
        <!--Bootstrap Icons-->
        <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.13.1/font/bootstrap-icons.min.css">
    </head>
    <body>
        <!--Cabecero-->
        <jsp:include page="/WEB-INF/paginas/comunes/cabecero.jsp" />

        <!--Formulario de Edicion de un cliente-->
        <form action="${pageContext.request.contextPath}/ServletControlador?accion=modificar&idCliente=${cliente.idCliente}" method="POST" class="was-validated">

            <!--Botones de navegacion de edicion-->
            <jsp:include page="/WEB-INF/paginas/comunes/botonesNavegacionEdicion.jsp" />

            <div class="container my-4">
                <div class="card">
                    <div class="card-header bg-primary text-white">
                        <h4>Editar Cliente</h4>
                    </div>
                    <div class="card-body">
                        <div class="form-group mb-3">
                            <label for="nombre">Nombre</label>
                            <input type="text" class="form-control" id="nombre" name="nombre" required value="${cliente.nombre}"/>
                        </div>
                        <div class="form-group mb-3">
                            <label for="apellido">Apellido</label>
                            <input type="text" class="form-control" id="apellido" name="apellido" required value="${cliente.apellido}"/>
                        </div>
                        <div class="form-group mb-3">
                            <label for="email">Email</label>
                            <input type="email" class="form-control" id="email" name="email" required value="${cliente.email}"/>
                        </div>
                        <div class="form-group mb-3">
                            <label for="telefono">Telefono</label>
                            <input type="tel" class="form-control" id="telefono" name="telefono" required value="${cliente.telefono}"/>
                        </div>
                        <div class="form-group mb-3">
                            <label for="saldo">Saldo</label>
                            <input type="number" class="form-control" id="saldo" name="saldo" required step="any" value="${cliente.saldo}"/>
                        </div>
                        <button type="submit" class="btn btn-success">Guardar Cambios </button>
                    </div>
                </div>
            </div>
        </form>

        <!--Pie pagina-->
        <jsp:include page="/WEB-INF/paginas/comunes/piePagina.jsp" />

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js" integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI" crossorigin="anonymous"></script>
    </body>
</html>