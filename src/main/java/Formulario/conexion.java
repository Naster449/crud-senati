/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.java.Formulario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Mathias
 */
public class conexion {
    public Connection conectar(){
        String url = "jdbc:mysql://localhost:3306/formulario?zeroDateTimeBehavior=CONVERT_TO_NULL";
        String user = "root";
        String password = "";
        Connection cn = null;
        
        try{
            cn =DriverManager.getConnection(url,user, password);
            if (cn !=null){
                System.out.println("Conectado");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
        return cn;
    }
    
}
