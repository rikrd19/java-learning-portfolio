package group_avila.tareas.presentacion;

import group_avila.tareas.TareasApplication;
import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;

public class SistemasTareasFX extends Application {

    // Permite agarrar el contexto de Spring para poder usar los beans que se han definido en la aplicación,
// como el servicio de tareas, el repositorio de tareas, etc.
    private ConfigurableApplicationContext applicationContext;

  /*  public static void main(String[] args) { // se comenta porque ya no es necesario, la clase que extiende de Application se lanza desde el main de TareasApplication
        launch(args);
    }*/

    @Override
    public void init() {
        // Arranca Spring Boot ANTES de que JavaFX muestre la ventana
        this.applicationContext = new SpringApplicationBuilder(TareasApplication.class).run();
    }

    @Override
    public void start(Stage stage) throws Exception {
        // Crea el cargador FXML(todavia no crea nada)
        FXMLLoader loader = new FXMLLoader(TareasApplication.class.getResource("/templates/index.fxml"));
       // Conecta Spring con JavaFX (para que @Autowired funcione) asi que cuando JavaFX necesite crear un controlador, le diga a Spring que lo haga, para que se puedan inyectar las dependencias de Spring en los controladores de JavaFX
        loader.setControllerFactory(applicationContext::getBean); // Le decimos a JavaFX que use el contexto de Spring para crear los controladores
        // Carga el archivo FXML y crea TODOS los elementos(objetos) en memoria, incluyendo el controlador, la tabla, las columnas, etc. y los vincula entre sí
        Scene scene = new Scene(loader.load());  // <-- Aquí se carga el archivo FXML y se crean los objetos en memoria, si el archivo FXML no se encuentra o tiene errores, aquí se lanzará una excepción IOException
       // Asigna la escena a la ventana (la prepara para mostrarla) y luego muestra la ventana de JavaFX
        stage.setScene(scene);
        stage.show();  // Muestra la ventana de JavaFX
    }

    public void stop(){
        applicationContext.close(); // Cierra el contexto de Spring cuando se cierra la aplicación JavaFX
        Platform.exit();
    }
}
