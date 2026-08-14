import { Injectable } from "@angular/core";
import { Persona } from "./persona.model";
import { DataService } from "./data-service";
import { Observable } from "rxjs";

@Injectable({
    providedIn: 'root'
})
export class PersonaService {
    personas: Persona[] = [];

    constructor(private dataservice: DataService) { }

    // Se usa para modificar el valor del arreglo debido ala llamada asincrona
    setPersonas(personas: Persona[]) {
        this.personas = personas;
    }

    obtenerPersonas() {
        return this.dataservice.cargarPersonas();
    }

    agregarPersona(persona: Persona): Observable<Persona> {
        return this.dataservice.agregarPersona(persona);
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

    modificarPersona(id: number, persona: Persona): Observable<Persona> {
        return this.dataservice.modificarPersona(id, persona);
    }

    eliminarPersona(id: number): Observable<void> {
        return this.dataservice.eliminarPersona(id);
    }
} 
