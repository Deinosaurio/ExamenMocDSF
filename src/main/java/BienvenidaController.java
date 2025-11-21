import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BienvenidaController {

    @GetMapping("/hola")
    public String saludar() {
        return "¡Hola Deyna! La aplicación funciona correctamente.";
    }
}