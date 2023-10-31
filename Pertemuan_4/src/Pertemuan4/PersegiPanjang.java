/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author lenovo
 */
public class PersegiPanjang extends bangundatar2{

    float panjang;
    float lebar;
    
    @Override
    float luas(){
        float rumus = panjang*lebar;
        System.out.println("Menghitung Luas Persegi Panjang "+ rumus);
        return 0;
    }
    @Override
    float keliling(){
        float rumus = 2*panjang+lebar;
        System.out.println("Menghitung Keliling Persegi Panjang "+ rumus);
        return 0;
    }
}
