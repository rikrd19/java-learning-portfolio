package avilawebservice.web;

import java.util.List;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import avilawebservice.domain.Persona;
import avilawebservice.servicio.IPersonaService;
import org.primefaces.event.RowEditEvent;

@Named("personaBean")
@ViewScoped
public class PersonaBean implements java.io.Serializable {

    @Inject
    private IPersonaService personaService;

    List<Persona> personas;

    private Persona personaSeleccionada;

    @PostConstruct
    public void inicializar() {
        this.personas = personaService.listarPersonas();
        this.personaSeleccionada = new Persona();
    }

    public void agregarPersona() {
        this.personaService.registrarPersona(personaSeleccionada);
        this.personas.add(personaSeleccionada);
        this.personaSeleccionada = new Persona();
    }

    public void reiniciarPersonaSeleccionada() {
        this.personaSeleccionada = new Persona();
    }

    public void editListener(RowEditEvent<Persona> event) {
        Persona persona = event.getObject();
        personaService.modificarPersona(persona);
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }

    public Persona getPersonaSeleccionada() {
        return personaSeleccionada;
    }

    public void setPersonaSeleccionada(Persona personaSeleccionada) {
        this.personaSeleccionada = personaSeleccionada;
    }

    public void eliminarPersona() {
        this.personaService.eliminarPersona(personaSeleccionada);
        this.personas.remove(this.personaSeleccionada);
        this.personaSeleccionada = null;
    }

}
