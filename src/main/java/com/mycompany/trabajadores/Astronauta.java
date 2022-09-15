/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajadores;
/**
 *
 * @author Stanislav
 */
public class Astronauta extends Persona{
     public Astronauta(String nom) {
        super(nom);
    }
     private int missionsOK;
     private String rangMilitar;
     private int graus;
     private int minuts;
     private int segons;
     private int NSEW;
     
     public int getGraus() {
        return graus;
    }
    public int getMinuts() {
        return minuts;
    }
    public int getSegons() {
        return segons;
    }
     public void enviarCoordenades(Astronauta As){
         
         graus = (int)(Math.random()*999);
         minuts = (int)(Math.random()*99);
         segons = (int)(Math.random()*59);
         
         int localNSEW = (int)(Math.random()*3);
         
         NSEW = switch (localNSEW) {
             case 0 -> 'N';
             case 1 -> 'S';
             case 2 -> 'E';
             default -> 'O';
         };
         
         System.out.println("Comunica Astronauta "+As.getNom()+" la seva localització es: "+As.getGraus()+"/"+As.getMinuts()+"/"+As.getSegons()+"["+NSEW+"]");
     }
     
     
      public static String encriptar(String frase){
        
        char c;
        String enc = "";
        
        for(int i = 0; i<frase.length(); i++){
            c = frase.charAt(i);
            
            if (c == 'a'|| c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U'){
                enc = enc + "";
            }else {
                enc = enc + c;
            }
            
        }
        
        return enc;
    }
     
     
     
     
     
     
     
     
     
     }