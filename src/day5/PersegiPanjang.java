/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day5;

public class PersegiPanjang {
    int panjang = 5;
    int lebar = 10;
    
    void luas(){
        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = "+luas+"cm");
    }
    
    void keliling(){
        int keliling = 2*(panjang * lebar);
        System.out.println("Keliling Persegi Panjang = "+keliling+"cm");
    }
}