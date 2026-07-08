<div class="modal fade" id="modalEliminar" tabindex="-1" aria-labelledby="modalEliminarLabel" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered">
        <div class="modal-content">
            <div class="modal-header border-0">
                <h5 class="modal-title text-danger" id="modalEliminarLabel">Confirmar eliminacion</h5>
                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Cerrar"></button>
            </div>
            <div class="modal-body">
                <p class="mb-0">
                    ¿Esta seguro que desea eliminar al empleado
                    <strong id="nombreEmpleadoEliminar"></strong>?
                </p>
                <small class="text-muted">Esta accion no se puede deshacer.</small>
            </div>
            <div class="modal-footer border-0">
                <button type="button" class="btn btn-secondary btn-sm" data-bs-dismiss="modal">Cancelar</button>
                <a id="btnConfirmarEliminar" href="#" class="btn btn-danger btn-sm">Eliminar</a>
            </div>
        </div>
    </div>
</div>
