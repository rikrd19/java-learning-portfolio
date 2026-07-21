package avilawebservice.web;

import avilawebservice.domain.Persona;
import avilawebservice.servicio.IPersonaService;
import jakarta.annotation.PostConstruct;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.primefaces.event.RowEditEvent;

@Named("personaBean")
@RequestScoped
public class PersonaBean {
  Logger log = LogManager.getRootLogger();
  
    @Inject
    private IPersonaService personaService;

    private Persona personaSeleccionada;

    List<Persona> personas;

    public PersonaBean() {
        log.debug("Iniciando el objeto PersonaBean");
    }

    @PostConstruct
    public void inicializar() {
        // Iniciamos las variables
        personas = personaService.listarPersonas();
        log.debug("personas recuperadas en ManageBean: "+this.personas);
        personaSeleccionada = new Persona();

    }

    public void editListener(RowEditEvent event) {
        Persona persona = (Persona) event.getObject();
        personaService.modificarPersona(persona);
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
