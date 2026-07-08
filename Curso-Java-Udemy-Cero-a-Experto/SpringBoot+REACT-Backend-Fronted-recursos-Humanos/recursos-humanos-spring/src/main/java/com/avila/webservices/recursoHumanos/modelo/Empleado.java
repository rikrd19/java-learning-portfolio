package com.avila.webservices.recursoHumanos.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity // Esta clase representa una tabla en la BD
@Data  // (lombok)Genera automáticamente getters, setters, toString, equals y hashCode
@NoArgsConstructor  // JPA lo necesita para crear objetos vacíos
@AllArgsConstructor  //Crear objetos completos de una vez, todos los atributos en el constructor
@ToString      //Mostrar el objeto como texto (logs, depuración)
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idEmpleado;
    String nombre;
    String departamento;
    Double sueldo;
}
