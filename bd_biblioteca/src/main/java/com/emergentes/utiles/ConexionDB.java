
package com.emergentes.utiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionDB {
    static String driver = "com.musql.jdbc.drive";
    static String url="jdb:mysql://localhost:3306/bd_biblioteca";
    static String usuario = "root";
    static String password ="";
    
    protected Connection conn = null;   

    public ConexionDB() {
        try {
   
        Class.forName(driver);
        conn = DriverManager.getConnection(url, usuario, password);
        if (conn != null){
            System.out.println("Conexion OK "+ conn);
        }
        
       }  catch (ClassNotFoundException ex){
                System.out.println("Error en especificacion de drive"+ ex.getMessage());
                } catch (SQLException ex) {
            System.out.println("Error al conectar "+ ex.getMessage());
        }        
}
    public Connection conectar()
    {
        return conn;
    }
    
    public void desconectar()
    { 
        try {
            conn.close();
        } catch (SQLException ex) {
            System.out.println("Error al cerrar" + ex.getMessage());
        }
    }
}
