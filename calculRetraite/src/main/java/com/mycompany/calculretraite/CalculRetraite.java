/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculretraite;
import java.util.Scanner;

/**
 *
 * @author hp
 */
public class CalculRetraite {

    public static void main(String[] args) {
        final int MAJORITE = 18;
        final int RETRAITE = 62;
        final int COTISE = 42;
        
        Scanner clavier = new Scanner(System.in);
        
        int age = clavier.nextInt();
        int durreCotisation = clavier.nextInt();   
        if( age >= 18){
            System.out.println("L'âge est supérieur ou égal à la majorité.");
            int anneesMajeur = age - MAJORITE;
            System.out.print("L'individu est majeur depuis " + anneesMajeur + " ans.");
        }else { 
            System.out.println("L'individu est mineur (inférieur à la majorité).");
        }
        
        //vériification retraite 
        
        if(age >= RETRAITE && durreCotisation >= COTISE){
            System.out.println("L'individu peut partir à la retraite.");
        }else { 
            System.out.println("L'individu ne peut pas encore partir à la retraite."); 
            if (age < RETRAITE) { 
                int anneesRestantesAge = RETRAITE - age; 
                System.out.println("Il reste " + anneesRestantesAge + " ans avant d'atteindre l'âge de la retraite."); 
            } 
        }
        
    }
}
