package avilawebservice.web;

import avilawebservice.Persona;
import avilawebservice.service.PersonaService;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private PersonaService personaService;
    
    @GetMapping("/")
    public String inicio(Model model) {
        
       List<Persona>  personas =  personaService.listarPersonas();
        model.addAttribute("personas", personas);
        return "index";
    }

}
