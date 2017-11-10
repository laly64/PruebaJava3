/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bd;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 **Lavinia Avalos Oyarzo
 *  @author LAB02
 * Fecha:Noviembre 10 de 2017
 * Programa: Conexion.Java
 * Responsabilidad: Clase principal
 * 
 */
public class ConexionBD 
{
    
    private static Connection conex;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASS = "";
    private static final String URL = "jdbc:mysql://localhost:3306/pruebajava3";
    
    
    public ConexionBD()
    {
        conex = null;
        
       
        try
        {
            Class.forName(DRIVER);
            conex = DriverManager.getConnection(URL, USER, PASS);
            if (conex != null) 
            {
             System.out.println("Conexion Establecida");
            }
        }
        catch(ClassNotFoundException | SQLException e)
        {
         System.out.println("Error en la Conexion");
        }
    }
    
    
    public Connection conectar()
    {
        return conex;
    }
    
    public void desconectar()
    {
      conex=null;
        if (conex==null) 
        {
          System.out.println("Conexion Finalizada");
        }
    }
}
