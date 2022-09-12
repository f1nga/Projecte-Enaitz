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
     public String getNom() {
        return nom;
    }

    public  void setNom(String nom) {
        this.nom = nom;
    }
     public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }
    
     public char getSexe() {
        return sexe;
    }

    public void setSexe(char sexe) {
        this.sexe = sexe;
    }
     public String getAdress() {
        return adressa;
    }

    public void setAdress(String adressa) {
        this.adressa = adressa;
    }
     public double getSalari() {
        return salari;
    }

    public void setSalari(double salari) {
        this.salari = salari;
    }
     public String getCiutat() {
        return ciutat;
    }

    public void setCiutat(String ciutat) {
        this.ciutat = ciutat;
    }
     public int getExp() {
        return anys_experiencia;
    }

    public void setExp(int anys_experiencia) {
        this.anys_experiencia= anys_experiencia;
    }
}
