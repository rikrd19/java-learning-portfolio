package zona_fit.conexion;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {

    public static Connection getConexion() {
        Connection conexion = null;
        String baseDatos = "zona_fit_deb";
        String url = "jdbc:mysql://127.0.0.1:3306/" + baseDatos;
        String usuario = "root";
        String password = "curso123";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
        } catch (Exception e) {
            System.out.println("Error al conectarnos a la BD: "+ e.getMessage());
        }
        return conexion;
    }

    public static void main(String[] args) {
        Connection conexion = Conexion.getConexion();
        if (conexion != null) {
            System.out.println("Conexion Exitosa" + conexion);
        } else {
            System.out.println("Error al conectarse ");
        } 
        
        
    }
}
