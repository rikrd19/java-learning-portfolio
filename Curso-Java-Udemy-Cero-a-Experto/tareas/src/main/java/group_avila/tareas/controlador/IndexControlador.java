package group_avila.tareas.controlador;

import group_avila.tareas.modelo.Tarea;
import group_avila.tareas.servicio.TareaServicio;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;


@Component
public class IndexControlador implements Initializable {
    private static final Logger logger = LoggerFactory.getLogger(IndexControlador.class);

    @Autowired
    private TareaServicio tareaServicio;  // integrar el servicio de Spring para acceder a los datos de las tareas

    @FXML
    private TableView<Tarea> tareaTabla;  // tabla para mostrar las tareas, se debe vincular con el componente de la vista

    @FXML
    private TableColumn<Tarea, Integer> idTareaColumna;  // columna para mostrar el ID de la tarea

    @FXML
    private TableColumn<Tarea, String> nombreTareaColumna;  // columna para mostrar el nombre de la tarea

    @FXML
    private TableColumn<Tarea, String> responsableColumna;  // columna para mostrar la descripción de la tarea

    @FXML
    private TableColumn<Tarea, String> estatusColumna;

    private final ObservableList<Tarea> tareaList = FXCollections.observableArrayList(); // lista observable para almacenar las tareas y actualizar la tabla automáticamente

    @FXML
    private TextField nombreTareaTexto;

    @FXML
    private TextField responsableTexto;

    @FXML
    private TextField estatusTexto;

    private Integer idTareaInterno;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        tareaTabla.getSelectionModel().setSelectionMode(SelectionMode.SINGLE); // configurar la tabla para permitir la selección de una sola fila
        configurarColumnas(); // configurar las columnas de la tabla para mostrar los datos de las tareas
        listarTareas(); // cargar las tareas desde el servicio y mostrarlas en la tabla
    }

    private void configurarColumnas() {
        idTareaColumna.setCellValueFactory(new PropertyValueFactory<>("idTarea")); // vincular la columna con la propiedad idTarea de la clase Tarea
        nombreTareaColumna.setCellValueFactory(new PropertyValueFactory<>("nombreTarea")); // vincular la columna con la propiedad nombreTarea de la clase Tarea
        responsableColumna.setCellValueFactory(new PropertyValueFactory<>("responsable")); // vincular la columna con la propiedad responsable de la clase Tarea
        estatusColumna.setCellValueFactory(new PropertyValueFactory<>("estatus")); // vincular la columna con la propiedad estatus de la

    }

    private void listarTareas() {
        logger.info("Ejecutando listado de tareas"); // agregar un mensaje de log para verificar que el método se está ejecutando correctamente
        tareaList.clear(); // limpiar la lista antes de cargar las tareas tipo ObservableList para evitar duplicados si se llama al método varias veces
        tareaList.addAll(tareaServicio.listarTareas()); // cargar las tareas desde el servicio y agregarlas a la lista observable
        tareaTabla.setItems(tareaList); // vincular la tabla con la lista observable para mostrar las tareas en la interfaz
    }

    public void agregarTarea() {
        if (nombreTareaTexto.getText().isEmpty()) {
            mostrarMensaje("Error Validacion", "Debe proporcionar una tarea");
            nombreTareaTexto.requestFocus();
            return;
        } else {
            Tarea tarea = new Tarea();
            recolectarDatosFormulario(tarea);
            tarea.setIdTarea(null); // asegurarse de que el ID de la tarea sea nulo para que se genere automáticamente al guardar la tarea en la base de datos
            tareaServicio.guardarTarea(tarea);
            mostrarMensaje("Informacion", "Tarea agregada");
            limpiarFormulario();
            listarTareas();
        }
    }

    public void cargarTareaFormulario() {
        Tarea tarea = tareaTabla.getSelectionModel().getSelectedItem(); // obtener la tarea seleccionada en la tabla
        if (tarea != null) {
            idTareaInterno = tarea.getIdTarea(); // almacenar el ID de la tarea seleccionada en una variable interna para usarla al actualizar la tarea
            nombreTareaTexto.setText(tarea.getNombreTarea());
            responsableTexto.setText(tarea.getResponsable());
            estatusTexto.setText(tarea.getEstatus());
        }
    }

    private void recolectarDatosFormulario(Tarea tarea) {
        if (idTareaInterno != null) {
            tarea.setIdTarea(idTareaInterno); // asignar el ID de la tarea seleccionada al objeto tarea para que se actualice en lugar de crear una nueva tarea
        }
        tarea.setNombreTarea(nombreTareaTexto.getText());
        tarea.setResponsable(responsableTexto.getText());
        tarea.setEstatus(estatusTexto.getText());
    }

    public void modificarTarea() {
        if (idTareaInterno == null) {
            mostrarMensaje("Informacion", "Debe seleccionar una tarea");
            return;
        }
        if (nombreTareaTexto.getText().isEmpty()) {
            mostrarMensaje("Error Validacion", "Debe proporcionar una tarea");
            nombreTareaTexto.requestFocus();
            return;
        }
        Tarea tarea = new Tarea();
        recolectarDatosFormulario(tarea);
        tareaServicio.guardarTarea(tarea);
        mostrarMensaje("Informacion", "Tarea modificada");
        limpiarFormulario();
        listarTareas();
    }

    public void eliminarTarea() {
        Tarea tarea = tareaTabla.getSelectionModel().getSelectedItem(); // obtener la tarea seleccionada en la tabla
        if (idTareaInterno == null) {
            mostrarMensaje("Informacion", "Debe seleccionar una tarea");
            return;
        }
        // Dialogo de confirmacion para eliminar la tarea
        Alert confirmacion = new Alert(Alert.AlertType.CONFIRMATION);
        confirmacion.setTitle("Confirmacion");
        confirmacion.setHeaderText("Eliminar Tarea");
        confirmacion.setContentText("Eiiminar: " + tarea.getNombreTarea() + "?");

        if (confirmacion.showAndWait().get() == ButtonType.OK) { // si el usuario confirma la eliminación, se procede a eliminar la tarea
            logger.info("Registro a eliminar: " + tarea.toString()); // agregar un mensaje de log para verificar que se está obteniendo la tarea seleccionada correctamente
            tareaServicio.eliminarTarea(tarea);
            mostrarMensaje("Informacion", "Tarea eliminada");
            limpiarFormulario();
            listarTareas();
        }
    }

    public void limpiarFormulario() {
        idTareaInterno = null;
        nombreTareaTexto.clear();
        responsableTexto.clear();
        estatusTexto.clear();
    }

    private void mostrarMensaje(String titulo, String mensaje) {
        Alert alerta = new Alert(Alert.AlertType.INFORMATION); // Ventana de dialogo emergente(tipo popup)
        alerta.setTitle(titulo);
        alerta.setHeaderText(null);
        alerta.setContentText(mensaje); // El mensaje que se muestra en la ventana de dialogo
        alerta.showAndWait(); // Mostrar la ventana de dialogo y esperar a que el usuario la cierre, se pausa antes de continuar con la ejecución del programa
    }

}
