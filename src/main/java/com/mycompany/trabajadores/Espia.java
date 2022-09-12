/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajadores;

/**
 *
 * @author didac
 */
public class Espia {
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
