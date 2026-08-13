import { HttpClient, HttpResponse } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Persona } from "./persona.model";


@Injectable({
    providedIn: 'root'
}) // El servicio se registra automáticamente en el inyector raíz de la aplicación.
export class DataService {
    urlBase = 'http://localhost:8080/Personas-Backend-Java/webservice/personas';

    constructor(private httpClient: HttpClient) { }

    cargarPersonas(): Observable<Persona[]> {
        return this.httpClient.get<Persona[]>(this.urlBase);
    }


    agregarPersona(persona: Persona): Observable<Persona> {
        return this.httpClient.post<Persona>(this.urlBase, persona);
    }


    modificarPersona(idPersona: number, persona: Persona): Observable<Persona> {
        let url: string;
        url = this.urlBase + '/' + idPersona;
        // this.httpClient.put<Persona>(url, persona)

        // .subscribe({        // <--  RxJS 7+ recomienda el objeto Observer con next y error.
        //     next: (response) => {      // <-- Función que se ejecuta cuando la petición es exitosa.
        //         console.log('resultado modificar persona: ' + response);
        //     },
        //     error: (error) => console.log('Error en modificar persona: ' + error)  // <-- Función que se ejecuta cuando la petición falla.
        // });

        return this.httpClient.put<Persona>(url, persona);
    }


    eliminarPersona(idPersona: number): Observable<void> {
        // let url: string;
        // url = this.urlBase + '/' + idPersona;
        // this.httpClient.delete<Persona>(url)
        // .subscribe({                 // <--  RxJS 7+ recomienda el objeto Observer con next y error.
        //     next: (response) => {    // <-- Función que se ejecuta cuando la petición es exitosa.
        //         console.log('resultado eliminar persona: ' + response);
        //     },
        //     error: (error) => console.log('Error en eliminar persona: ' + error)   // <-- Función que se ejecuta cuando la petición falla.
        // });

        const url = `${this.urlBase}/${idPersona}`;
        return this.httpClient.delete<void>(url);

    }
}
