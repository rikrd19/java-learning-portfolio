package group_avila.tareas.repositorio;

import group_avila.tareas.modelo.Tarea;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TareaRepositorio extends JpaRepository<Tarea, Integer> {

}
