package avilawebservice.web;

import avilawebservice.domain.Persona;
import avilawebservice.servicio.IPersonaService;
import jakarta.annotation.PostConstruct;
import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.event.RowEditEvent;

@Named("personaBean")
@ViewScoped
public class PersonaBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private final Logger log = LogManager.getRootLogger();

    @Inject
    private IPersonaService personaService;

    private Persona personaSeleccionada;

    private List<Persona> personas;

    public PersonaBean() {
        log.debug("Iniciando el objeto PersonaBean");
    }

    @PostConstruct
    public void inicializar() {
        personas = personaService.listarPersonas();
        log.debug("personas recuperadas en ManageBean: " + this.personas);
        personaSeleccionada = new Persona();
    }

    public void editListener(RowEditEvent event) {
        Persona persona = (Persona) event.getObject();
        personaService.modificarPersona(persona);
    }

    public void reiniciarPersonaSeleccionada() {
        this.personaSeleccionada = new Persona();
    }

    public void agregarPersona() {
        this.personaService.registrarPersona(personaSeleccionada);
        this.personas.add(personaSeleccionada);
        this.personaSeleccionada = new Persona();
    }

    public void eliminarPersona() {
        if (personaSeleccionada == null || personaSeleccionada.getIdPersona() == null) {
            return;
        }
        this.personaService.eliminarPersona(personaSeleccionada);
        this.personas.remove(this.personaSeleccionada);
        this.personaSeleccionada = new Persona();
    }

    public Persona getPersonaSeleccionada() {
        return personaSeleccionada;
    }

    public void setPersonaSeleccionada(Persona personaSeleccionada) {
        this.personaSeleccionada = personaSeleccionada;
    }

    public List<Persona> getPersonas() {
        return personas;
    }

    public void setPersonas(List<Persona> personas) {
        this.personas = personas;
    }
}
