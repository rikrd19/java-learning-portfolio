import { Routes } from '@angular/router';
import { PersonasComponent } from './personas/personas.component';
import { FormularioComponent } from './formulario/formulario.component';

export const routes: Routes = [
    { path: 'personas', component: PersonasComponent }, // Ruta para listar personas
    { path: 'formulario', component: FormularioComponent },
    { path: 'formulario/:id', component: FormularioComponent }, // para edicion
    { path: '', redirectTo: '/personas', pathMatch: 'full' },  // <- redireccion por defecto 
    { path: '**', redirectTo: '/personas' } // <- Ruta comodin (404)
];
