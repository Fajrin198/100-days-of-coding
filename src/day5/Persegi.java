/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day5;

public class Persegi {
    int panjang_sisi = 5;
    
    void luas(){
        int luas = panjang_sisi * panjang_sisi;
        System.out.println("Luas Persegi = "+luas+"cm");
    }
    
    void keliling(){
        int keliling = panjang_sisi * 4;
        System.out.println("Keliling Persegi = "+keliling+"cm");
    }
}