import { Injectable } from "@angular/core";
import { Persona } from "./persona.model";
import { DataService } from "./data-service";

@Injectable()
export class PersonaService {

    personas: Persona[] = [];

    constructor(private dataservice: DataService) { }

    // Se usa para modificar el valor del arreglo debido ala llamada asincrona
    setPersonas(personas: Persona[]) {
        this.personas = this.personas;
    }

    agregarPersona(persona: Persona) {
        console.log('persona a agregar: ' + persona.nombre);
        this.dataservice.agregarPersona(persona)
            .subscribe({
                next: (persona: Persona) => {
                    // Recuperamos el objeto Persona con el id Persona recien agregado
                    console.log('se agrega al arreglo la persona recien insertada suscriber: ' + persona.idPersona);
                    this.personas.push(persona);
                },
            });
    }

    encontrarPersona(id: number): Persona | undefined {
        const persona = this.personas.find(p => p.idPersona == id);
        if (!persona) {
            console.log('No se encontro la persona con id: ' + id);
            return undefined;
        }
        console.log('persona encontrada: ' + persona.idPersona + ' ' + persona.nombre);
        return persona;
    }

    modificarPersona(id: number, persona: Persona) {
        console.log('persona a modificar: ' + persona.idPersona);
        this.dataservice.modificarPersona(id, persona);

    }

    eliminarPersona(id: number) {
        console.log('eliminar persona con id: ' + id);
        const index = this.personas.findIndex(persona => persona.idPersona == id); // encontramos el indice en el arreglo
        this.personas.splice(index, 1);
        this.dataservice.eliminarPersona(id);
    }
} 
