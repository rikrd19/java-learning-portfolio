<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.8/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-FKyoEForCGlyvwx9Hj09JcYn3nv7wiPVlz7YYwJrWVcXK/BmnVDxM+D2scQbITxI"
        crossorigin="anonymous"></script>
<script>
    (function () {
        const modal = document.getElementById('modalEliminar');
        if (!modal) {
            return;
        }
        modal.addEventListener('show.bs.modal', function (event) {
            const button = event.relatedTarget;
            document.getElementById('nombreEmpleadoEliminar').textContent = button.getAttribute('data-nombre');
            document.getElementById('btnConfirmarEliminar').href = button.getAttribute('data-url');
        });
    })();
</script>
</body>
</html>
