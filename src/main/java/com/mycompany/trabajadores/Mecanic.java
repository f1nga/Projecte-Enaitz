/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajadores;


import com.mycompany.connection.ConnectorDB;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author didac
 */
public class Mecanic extends Persona{
    
    static Scanner teclat = new Scanner(System.in);
    
    public Mecanic(String nom) {
        super(nom);
    }
    int anysExperiencia;
    int numeroTaller;
     
    public  void setAnysExperiencia(int anysExperiencia) {
        this.anysExperiencia = anysExperiencia;
    }
    public int getAnysExperiencia() {
        return anysExperiencia;
    }
    public  void setNumeroTaller(int numeroTaller) {
        this.numeroTaller = numeroTaller;
    }
    public int getNumeroTaller() {
        return numeroTaller;
    }
     
    public void tempsReparacio(){
        String [] diaSemana  = {"Dilluns","Dimarts","Dimecres","Dijous","Divendres","Dissabte","Diumenge"};
        String [] mes = {"Gener","Febrer","Marc","Abril","Maig","Juny","Juliol","Agost","Septembre","Octubre","Novembre","Decembre"};
        int diaNum ;
        int diaSemanaNum = (int)(Math.random()*7+1);
        int mesNum = (int)(Math.random()*12+1);
         
        diaNum = (int) (switch (mes[mesNum]) {
            case "Gener", "Marc", "Maig", "Juliol", "Agost", "Octubre", "Desembre" -> (Math.random()*31)+1;
            case "Febrer" -> (Math.random()*28)+1;
            default -> (Math.random()*30)+1;
         });
        
        
        System.out.println("El mecanic tindra llesta la reparacio per el: "+diaSemana[diaSemanaNum]+" "+diaNum+" de "+mes[mesNum]);   
     }
     
    public static String fitxarEntrada(){
         System.out.println("Hora d'entrada al treball? ");
         String horaEntrada= teclat.next();
         
        return horaEntrada;
     }
     
    public static String fitxarSortida(){
        System.out.println("Hora de sortida al treball?");
        String horaSortida=teclat.next();
         
        return horaSortida;
     }
    
    
     public  String[][] llistaCotxes() throws SQLException{
        ConnectorDB conexio = new ConnectorDB();
        conexio.connectarBaseDades();
        String [][] dadesCotxes = new String[2][2];//poseu llargada i na fent 
        
            try{
            String sql = "SELECT*FROM cotxes";
            PreparedStatement st = conexio.con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();
            
            int i = 0;
            while(rs.next()){
                for (int j = 0; j <= 1; j++) {
                    dadesCotxes[i][j]=rs.getString(j+1);
                }
                i=i+1;
            }
            
              for (int k = 0; k < 1; k++) {
                   for (int l = 0; l <= 1; l++) {
                  
                    System.out.println(dadesCotxes[k][l]);
                }
              }
            conexio.con.close();
        }catch(SQLException e){System.out.println("error fort"+e);}
        return dadesCotxes;
    }
     
     
   
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
     
       

    }
     
          
    
  
