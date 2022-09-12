/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajadores;

import com.mycompany.connection.ConnectorDB;
import java.awt.EventQueue;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author didac
 */

public class Astronauta extends Persona{
     public Astronauta(String nom) {
        super(nom);
    }
     private int missionsOK;
     private String rangMilitar;
     
     
      public static void inserirAstronauta(String nom,String adreca,int edat,int missionsOK,int missionsKO,String rang,String dataVol) throws SQLException, FileNotFoundException {
        
        ConnectorDB conex = new ConnectorDB();
        conex.connectarBaseDades();  
        try{
            String sql = "INSERT INTO astronauta VALUES(?,?,?,?,?,?,?)";

            PreparedStatement sentencia = conex.con.prepareStatement(sql);
            sentencia.setString(1,nom);
            sentencia.setString(2,adreca);
            sentencia.setInt(3, edat);
            sentencia.setInt(4,missionsOK);
            sentencia.setInt(5,missionsKO);
            sentencia.setString(6,rang);
            sentencia.setString(7,dataVol);
            System.out.println("Contacte inserit");
            sentencia.executeUpdate();
        }catch(SQLException e){
            System.out.println("error fort"+e);
        }
    }
   
    
    
   
      
}
