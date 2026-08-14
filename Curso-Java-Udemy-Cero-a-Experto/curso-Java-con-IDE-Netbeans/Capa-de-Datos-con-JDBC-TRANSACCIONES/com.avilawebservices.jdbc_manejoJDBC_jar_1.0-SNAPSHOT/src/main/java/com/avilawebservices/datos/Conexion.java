package com.avilawebservices.datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {
  
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/test?useSSL=false&useTimezone=true&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASSWORD = "curso*123";
            
    
    public static Connection getConnection() throws SQLException{
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASSWORD);
        
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

