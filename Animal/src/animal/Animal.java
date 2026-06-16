/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animal;

/**
 *
 * @author hp
 */
class Animal {

    public void manger(){
        System.out.println("cet animal mange");
    }
     
    public static void main(String[] args){
        Chien chien = new Chien();
        
        chien.manger();
        chien.aboyer();
    }
    
}

class Chien extends Animal{
    public void aboyer(){
        System.out.println("ce chien est méchant");
    }
}

