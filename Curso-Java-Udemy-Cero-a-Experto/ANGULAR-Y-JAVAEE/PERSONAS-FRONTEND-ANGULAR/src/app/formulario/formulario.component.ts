import { CommonModule } from '@angular/common';
import { Component, OnDestroy, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { PersonaService } from '../persona-service';
import { ActivatedRoute, Params, Router } from '@angular/router';
import { Persona } from '../persona.model';
import { Subscription } from 'rxjs';

@Component({
  selector: 'app-formulario',
  standalone: true,
  imports: [CommonModule, FormsModule],      // para usar ngModel, *ngIf, etc.
  templateUrl: './formulario.component.html',
  styles: []
})
export class FormularioComponent implements OnInit, OnDestroy {

  idPersona: number = 0;
  nombreInput: string = '';
  private subscripcionParams!: Subscription;

  constructor(private personaService: PersonaService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit() {
    this.subscripcionParams = this.route.params.subscribe((params: Params) => {
      this.idPersona = Number(params['idPersona'] || 0);
      this.nombreInput = '';  // resetea el formulario para la sgte entrada 

      if (this.idPersona > 0) {
        const persona = this.personaService.encontrarPersona(this.idPersona);
        if (persona) {
          this.nombreInput = persona.nombre;
        }
      }
    });
  }

  ngOnDestroy() {
    this.subscripcionParams.unsubscribe();
  }

  onGuardarPersona() {
    const personaAGuardar = new Persona(this.idPersona, this.nombreInput);

    const operacion = this.idPersona > 0
      ? this.personaService.modificarPersona(this.idPersona, personaAGuardar)
      : this.personaService.agregarPersona(personaAGuardar);

    operacion.subscribe({
      next: () => this.router.navigate(['personas']),
      error: (error) => console.error('Error al guardar:', error)
    });
  }

  onEliminarPersona() {
    if (this.idPersona <= 0) {
      return;  // sin un id real no hay nada que eliminar
    }

    this.personaService.eliminarPersona(this.idPersona).subscribe({
      next: () => this.router.navigate(['personas']),
      error: (error) => console.error('Error al eliminar:', error)
    });
  }
}
