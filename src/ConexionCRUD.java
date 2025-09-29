/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Roberto Flores Reyes
 */

import java.sql.*;

public class ConexionCRUD {
     
    private static String url = "jdbc:mysql://localhost:3306/pruebaMan1";
    private static String user = "root";
    private static String pass = "PoisonIvy6165##.";
    
    
    public static Connection conectar(){
    
        Connection con = null;
        
        try{
            
            con = DriverManager.getConnection(url,user,pass);
            System.out.println("Conexion realizada con exito.");
            
        }catch (SQLException e){
            
            System.out.println("Conexion fallida.");
            e.printStackTrace();
            
        }
        
        return con;
    }
}
