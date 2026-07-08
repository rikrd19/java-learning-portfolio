package com.avilawebservices.datos;

import static com.avilawebservices.datos.Conexion.getDataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.sql.DataSource;
import org.apache.commons.dbcp2.BasicDataSource;

public class Conexion {
  
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "curso*123";
            
    //
    public static DataSource getDataSource(){
       BasicDataSource ds = new BasicDataSource();
       ds.setUrl(JDBC_URL);
       ds.setUsername(JDBC_USER);
       ds.setPassword(JDBC_PASSWORD);
       // Se define el tamaño inicial del pool de conexiones
       ds.setInitialSize(5);
       return ds;
    }
    
    public static Connection getConnection() throws SQLException{
        return getDataSource().getConnection();
        
    }
    
    public static void close(ResultSet rs) throws SQLException {
        try{
          rs.close();  
        }catch(SQLException e){
           e.printStackTrace(System.out);
        }
        
    }
    
    public static void close(Statement smtm) throws SQLException {
         try{
          smtm.close();  
        }catch(SQLException e){
           e.printStackTrace(System.out);
        }
    }
    
    public static void close(PreparedStatement smtm) throws SQLException {
        try{
          smtm.close();  
        }catch(SQLException e){
           e.printStackTrace(System.out);
        }
    }
    
    public static void close(Connection conn) throws SQLException {
    try{
          conn.close();  
        }catch(SQLException e){
           e.printStackTrace(System.out);
        }
    }
    
}

