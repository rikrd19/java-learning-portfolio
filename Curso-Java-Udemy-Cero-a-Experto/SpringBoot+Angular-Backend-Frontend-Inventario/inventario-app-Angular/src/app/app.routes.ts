import { Routes } from '@angular/router';
import { ProductoLista } from './producto-lista/producto-lista';
import { AgregarProducto } from './agregar-producto/agregar-producto';
import { EditarProducto } from './editar-producto/editar-producto';

// La aplicacion responde a http://localhost:4200/productos
export const routes: Routes = [
    { path: 'productos', component: ProductoLista },
    { path: 'agregar-producto', component: AgregarProducto },
    { path: '', redirectTo: 'productos', pathMatch: 'full' },
    { path: 'editar-producto/:id', component: EditarProducto}
];

