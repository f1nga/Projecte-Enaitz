/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.trabajadores;

/**
 *
 * @author didac
 */
public abstract class Persona {

    private String nom;
    private int edat;
    private char sexe;
    private String adressa;
    private double salari;
    private String ciutat;
    private int anys_experiencia;
    
    public Persona(String nom) {
        this.nom = nom;
    }
}
