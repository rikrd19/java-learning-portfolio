import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { PersonaService } from '../persona-service';
import { ActivatedRoute, Router } from '@angular/router';
import { Persona } from '../persona.model';

@Component({
  selector: 'app-formulario',
  standalone: true,
  imports: [CommonModule, FormsModule],      // para usar ngModel, *ngIf, etc.
  templateUrl: './formulario.component.html',
  styles: ``
})
export class FormularioComponent implements OnInit {

  idPersona: number = 0;
  nombreInput: string = '';


  constructor(private personaService: PersonaService,
    private router: Router,
    private route: ActivatedRoute
  ) { }

  ngOnInit() {

  }

  onGuardarPersona() {
    const personaAGuardar = new Persona(this.idPersona, this.nombreInput);
    this.personaService.agregarPersona(personaAGuardar);
    this.router.navigate(['personas']);
  }
}
