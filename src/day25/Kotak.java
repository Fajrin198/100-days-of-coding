/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day25;

import lanjutanDay25.PersegiPanjang;

/**
 *
 * @author MY ASUS
 */
public class Kotak {
    protected String warna = "Merah";
    PersegiPanjang pp = new PersegiPanjang();
    
    protected void test(){
        System.out.println("berhasil");
    }
    
    public static void main(String[] args) {
        Kotak a = new Kotak();
        System.out.println(a.warna);
    }
}
