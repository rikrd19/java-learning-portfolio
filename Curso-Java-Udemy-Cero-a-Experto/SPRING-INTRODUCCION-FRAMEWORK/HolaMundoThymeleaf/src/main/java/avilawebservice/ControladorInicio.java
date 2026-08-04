package avilawebservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {

    @Value("${index.saludo}")
    private String saludo;

    @GetMapping("/")
    public String inicio(Model model) {
        String mensaje = "Mensaje con Thymeleaf al navegador";

        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jpere@mail.com");
        persona.setTelefono("3434334");

        Persona persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Gomez");
        persona2.setEmail("kgome@mail.com");
        persona2.setTelefono("343434343");

//       List<Persona> personas = new ArrayList();
//       personas.add(persona);
//       personas.add(persona);
        //otra forma
        var personas = Arrays.asList(persona, persona2);

        model.addAttribute("mensaje", mensaje);
        model.addAttribute("saludo", saludo);
        model.addAttribute("persona", persona);
        model.addAttribute("personas", personas);
        return "index";
    }

}
