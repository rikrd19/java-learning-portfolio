import { Component } from '@angular/core';
import { NgForOf } from "@angular/common";
import { PersonaService } from '../persona-service';
import { ActivatedRoute, Route, Router } from '@angular/router';
import { Persona } from '../persona.model';

@Component({
  selector: 'app-personas',
  imports: [NgForOf],
  templateUrl: './personas.component.html',
  styles: ``
})
export class PersonasComponent {

  personas: Persona[] = [];

  constructor(private personaService: PersonaService,
    private router: Router,
    private route: ActivatedRoute) {
  }

  ngOnInit(): void {
    this.personaService.obtenerPersonas()
      .subscribe({
        next: (personasObtnidas: Persona[]) => {
          //cargamos los datos de persona obtenidos en el arreglo local
          this.personas = personasObtnidas;
          this.personaService.setPersonas(this.personas);
          console.log('personas obtenidas del suscriber: ' + this.personas);
        }
      });
  }

}
