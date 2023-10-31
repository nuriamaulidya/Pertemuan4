/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author lenovo
 */
public class Segitiga extends bangundatar2 {

   float alas;
   float tinggi;
   float sisi;
   
   @Override
   float luas(){
       float rumus = 1/2*alas*tinggi;
       System.out.println("Menghitung Luas Segitiga "+ rumus);
       return 0;
   }
   @Override
   float keliling(){
       float rumus = 3*sisi;
       System.out.println("Menghitung Keliling Segitiga "+ rumus);
       return 0;
   }
}
