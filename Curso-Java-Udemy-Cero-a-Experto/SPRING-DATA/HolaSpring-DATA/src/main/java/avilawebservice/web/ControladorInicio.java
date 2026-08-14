package avilawebservice.web;

import avilawebservice.Persona;
import avilawebservice.dao.IPersonaDao;
import java.util.Optional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Autowired
    private IPersonaDao personaDao;
    
    @GetMapping("/")
    public String inicio(Model model) {
        
        var personas = personaDao.findAll();
        model.addAttribute("personas", personas);
        return "index";
    }

}
