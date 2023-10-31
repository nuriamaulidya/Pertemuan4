/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pertemuan4;

/**
 *
 * @author lenovo
 */
public class Lingkaran extends bangundatar2 {

    float r;
    float phi;
    @Override
    float luas(){
    float rumus = phi*r*r;
        System.out.println("Menghitung Luas Lingkaran "+ rumus );
        return 0;
    }
    @Override
    float keliling(){
        float rumus = 2*phi*r;
        System.out.println("Menghitung Keliling Lingkaran "+ rumus );
        return 0;
    }
    }
