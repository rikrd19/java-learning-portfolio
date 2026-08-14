import { inject } from '@angular/core';
import { CanActivateFn, Router } from '@angular/router';

export const formularioSoloTrasNavegacionGuard: CanActivateFn = () => {
    const router = inject(Router);

    // La navegación inicial (id = 1) ocurre al cargar/recargar la página.
    // Si el usuario recarga o entra directo a una ruta del formulario,
    // lo redirigimos a la lista: el formulario solo debe verse tras hacer click.
    const navigationId = router.getCurrentNavigation()?.id;
    if (navigationId === 1) {
        router.navigate(['/personas']);
        return false;
    }

    return true;
};
