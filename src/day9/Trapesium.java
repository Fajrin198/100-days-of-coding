/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day9;

/**
 *
 * @author MY ASUS
 */
public class Trapesium {
    double sisiAtas;
    double sisiBawah;
    double sisiMiring;
    double tinggi;

    public void setSisiAtas(double sisiAtas) {
        this.sisiAtas = sisiAtas;
    }

    public void setSisiBawah(double sisiBawah) {
        this.sisiBawah = sisiBawah;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
    
    public void hitungLuas(){
        double luas = 0.5 *(sisiAtas+sisiBawah)*tinggi;
        System.out.println("Luas Trapesium = "+luas);
    }
    
    public void hitungKeliling(){
        double keliling = tinggi+sisiAtas+sisiBawah+sisiMiring;
        System.out.println("Keliling Trapesium = "+keliling);
    }
}
