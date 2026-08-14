import { Routes } from '@angular/router';
import { PersonasComponent } from './personas/personas.component';
import { FormularioComponent } from './formulario/formulario.component';
import { formularioSoloTrasNavegacionGuard } from './formulario.guard';

export const routes: Routes = [
    { path: '', redirectTo: 'personas', pathMatch: 'full' },
    {
        path: 'personas',
        component: PersonasComponent,
        children: [
            {
                path: 'agregar',
                component: FormularioComponent,
                canActivate: [formularioSoloTrasNavegacionGuard]
            },
            {
                path: ':idPersona',
                component: FormularioComponent,
                canActivate: [formularioSoloTrasNavegacionGuard]
            }
        ]
    }
];