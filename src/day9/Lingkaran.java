/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day9;

/**
 *
 * @author MY ASUS
 */
public class Lingkaran {
    double r;
    final double PHI = 3.14;

    public void setR(double r) {
        this.r = r;
    }
    
    public void hitungLuas(){
        double luas = PHI*r*r;
        System.out.println("Luas lingkaran = "+luas);
    }
    
    public void hitungKeliling(){
        double keliling = 2*PHI*r;
        System.out.println("Keliling = "+keliling);
    }
}
