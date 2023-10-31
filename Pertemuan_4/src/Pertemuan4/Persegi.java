/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan4;


public class Persegi extends bangundatar2 {
    float sisi;
    
    @Override
    float luas(){
        float rumus = sisi*sisi;
        System.out.println("Menghitung Luas Persegi "+ rumus);
        return 0;
    }
    @Override
    float keliling(){
        float rumus = 4*sisi;
        System.out.println("Menghitung Keliling Persegi "+ rumus);
        return 0;
    }
}
