import { Component, OnDestroy, OnInit } from '@angular/core';
import { NgForOf } from "@angular/common";
import { PersonaService } from '../persona-service';
import { ActivatedRoute, NavigationEnd, Router, RouterLink, RouterOutlet } from '@angular/router';
import { Persona } from '../persona.model';
import { filter, Subscription } from 'rxjs';

@Component({
  selector: 'app-personas',
  standalone: true,
  imports: [NgForOf, RouterLink, RouterOutlet],
  templateUrl: './personas.component.html',
  styles: ``
})
export class PersonasComponent implements OnInit, OnDestroy {

  personas: Persona[] = [];
  private subscripcionRouter!: Subscription;

  constructor(private personaService: PersonaService,
    private router: Router,
    private route: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.cargarPersonas();

    // Al volver desde la ruta del formulario, este componente se reutiliza
    // y ngOnInit no se ejecuta de nuevo, por lo que recargamos la lista aquí.
    this.subscripcionRouter = this.router.events
      .pipe(filter((event): event is NavigationEnd => event instanceof NavigationEnd))
      .subscribe((event: NavigationEnd) => {
        if (event.url === '/personas') {
          this.cargarPersonas();
        }
      });
  }

  ngOnDestroy() {
    this.subscripcionRouter.unsubscribe();
  }

  cargarPersonas() {
    this.personaService.obtenerPersonas()
      .subscribe({
        next: (personasObtenidas: Persona[]) => {
          this.personas = personasObtenidas;
          this.personaService.setPersonas(this.personas);
        },
        error: (error) => console.error('Error al cargar personas:', error)
      });
  }

  irAgregar() {
    this.router.navigate(['/personas/agregar']);
  }
}
