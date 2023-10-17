/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day9;

/**
 *
 * @author MY ASUS
 */
public class Segitiga {
    double alas;
    double tinggi;
    double sisiMiring;

    public void setAlas(double alas) {
        this.alas = alas;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setSisiMiring(double sisiMiring) {
        this.sisiMiring = sisiMiring;
    }
    
    public void HitungLuas(){
        double luas = 0.5*alas*tinggi;
        System.out.println("Luas Segitiga = "+luas);
    }
    
    public void HitungKeliling(){
        double keliling = tinggi+sisiMiring+alas;
        System.out.println("Keliling Segitiga = "+keliling);
    }
}
