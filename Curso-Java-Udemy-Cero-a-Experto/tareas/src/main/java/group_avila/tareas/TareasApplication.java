package group_avila.tareas;

import group_avila.tareas.presentacion.SistemasTareasFX;
import javafx.application.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class TareasApplication {

	public static void main(String[] args) {
		//SpringApplication.run(TareasApplication.class, args); // se comenta para lanzar la aplicación JavaFX

        Application.launch(SistemasTareasFX.class, args);  // se lanza la aplicación JavaFX, se le pasa la clase que extiende de Application y los argumentos
	}

}
