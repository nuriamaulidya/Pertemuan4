/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan4;


public class Run {

    
    public static void main(String[] args) {
        Enemy_Burung EB = new Enemy_Burung();
        EB.attack();
        
        Zombie Z = new Zombie();
        Z.walk();
        
        Pocong P = new Pocong();
        P.jump();
        
        Burung B = new Burung();
        B.fly();
        B.jump();
        B.walk();
        
        }
}
