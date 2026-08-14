package com.avila.webservices.empleados.modelo;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer idEmpleado;  // en la base de datos se llama id_empleado, (Snake case).
    String nombreEmpleado; // en la base de datos se llama nombre_empleado, (Snake case).
    String departamento;
    Double sueldo;
}

