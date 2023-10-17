/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day9;

/**
 *
 * @author MY ASUS
 */
public class BelahKetupat {
    double d1;
    double d2;
    double s;

    public void setD1(double d1) {
        this.d1 = d1;
    }

    public void setD2(double d2) {
        this.d2 = d2;
    }

    public void setS(double s) {
        this.s = s;
    }
    
    public void hitungLuas(){
        double luas = 0.5*d1*d2;
        System.out.println("Luas Belah Ketupat = "+luas);
    }
    
    public void hitungKeliling(){
        double keliling = 4*s;
        System.out.println("Keliling Belah Ketupat = "+keliling);
    }
}
