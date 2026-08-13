import { Routes } from '@angular/router';
import { PersonasComponent } from './personas/personas.component';

export const routes: Routes = [
    { path: 'personas', component: PersonasComponent }, // Ruta para listar personas
    { path: '', redirectTo: '/personas', pathMatch: 'full' },  // <- redireccion por defecto 
    { path: '**', redirectTo: '/personas' } // <- Ruta comodin (404)
];
