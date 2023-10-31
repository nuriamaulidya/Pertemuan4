/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author lenovo
 */
public class RunHewan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Enemy E = new Enemy();
        E.kenal();
        
        Hewan H = new Hewan();
        H.makan();
        H.peka();
        H.tumbuh();
        
        Kancil K = new Kancil();
        K.cerdik();
        
        Ular U = new Ular();
        U.caraMakan();
        
        Kodok kd = new Kodok();
        kd.caraBerjalan();
    }
    
}
