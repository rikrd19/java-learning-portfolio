package com.avilawebservice.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class ManejoJDBC {
    public static void main(String[] args){
        
       String url = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
        try {
            //Class.forName("com.mysql.cj.jdbc.Driver");  // en aplicaciones se puede necesitar si no llegase a conectar]
            Connection conexion = DriverManager.getConnection(url, "root", "curso*123");
            Statement instruccion = conexion.createStatement();
            String sql = "SELECT id_persona, nombre, apellido, email, telefono FROM persona";
            ResultSet resultado = instruccion.executeQuery(sql);
            while(resultado.next()){
                System.out.print("Id Persona: "+ resultado.getInt("id_persona"));
                System.out.print(" Nombre: "+resultado.getString("nombre"));
                System.out.print(" Apellido: "+resultado.getString("apellido"));
                System.out.print(" Email: "+resultado.getString("email"));
                System.out.print(" Telefono: "+resultado.getString("telefono"));
                System.out.println("");
            }
            resultado.close();
            instruccion.close();
            conexion.close();
            
//        } catch (ClassNotFoundException ex) {
//            ex.printStackTrace(System.out);
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        }
       
    }
}
