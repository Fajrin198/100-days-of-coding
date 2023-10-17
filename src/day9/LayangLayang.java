/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day9;

/**
 *
 * @author MY ASUS
 */
public class LayangLayang {
    double d1;
    double d2;
    double sisiMiringAtas;
    double sisiMiringBawah;

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public void setSisiMiringAtas(double sisiMiringAtas) {
        this.sisiMiringAtas = sisiMiringAtas;
    }

    public void setSisiMiringBawah(double sisiMiringBawah) {
        this.sisiMiringBawah = sisiMiringBawah;
    }
    
    public void hitungLuas(){
        double luas = 0.5*d1*d2;
        System.out.println("Luas Layang-Layang = "+luas);
    }
    
    public void hitungKeliling(){
        double keliling = (sisiMiringAtas*2)+(sisiMiringBawah*2);
        System.out.println("Keliling Layang-Layang = "+keliling);
    }
}
