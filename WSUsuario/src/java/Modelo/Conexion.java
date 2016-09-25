/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Alex
 */
import java.sql.*;

public class Conexion {
    public Conexion(){
        
    }
    
    public Connection getConexion(){
       Connection con = null;
       try{
           /* carga ! registra el drive JDBC */
          Class.forName("com.mysql.jdbc.Driver").newInstance();
          /* Obtener la conexión */
          con = DriverManager.getConnection("jdbc:mysql://ca-cdbr-azure-central-a.cloudapp.net:3306/arau_zco","b04509dd6946ce","cf597077");
         } catch(SQLException ex){
           
       } catch(Exception e){
         }
       return con;
    }
}
