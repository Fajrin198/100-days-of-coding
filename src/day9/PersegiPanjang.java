/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day9;

/**
 *
 * @author MY ASUS
 */
public class PersegiPanjang {
    int panjang;
    int lebar;

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    public void Hitungluas(){
        int luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang = "+luas);
    }
    
    public void Hitungkeliling(){
        int keliling = (2*panjang) + (2*lebar);
        System.out.println("Keliling Persegi Panjang = "+keliling);
    }
}
