/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author lenovo
 */
public class Main {

    
    public static void main(String[] args) {
        // Objek bangun datar
        bangundatar2 bd = new bangundatar2();
        
        Persegi P =  new Persegi();
        P.sisi = 5;
        
        Lingkaran L = new Lingkaran();
        L.r = 22;
        L.phi = (float) 3.14;
        
        PersegiPanjang PP = new PersegiPanjang();
        PP.lebar = 6;
        PP.panjang = 12;
        
        Segitiga S = new Segitiga();
        S.alas = 5;
        S.tinggi = 10;
        S.sisi = 5;
        
        
        //Menunjukkan Inheriteance
        bd.luas();
        bd.keliling();
  
        P.luas();
        P.keliling();
        
        
        L.luas();
        L.keliling();
       
        PP.luas();
        PP.keliling();
  
        S.luas();
        S.keliling();
    }
    
}
