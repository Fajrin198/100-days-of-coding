/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day9;

/**
 *
 * @author MY ASUS
 */
public class JajarGenjang {
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
    
    public void hitungLuas(){
        double luas = alas*tinggi;
        System.out.println("Luas Jajar Genjang = "+luas);
    }
    
    public void hitungKeliling(){
        double keliling = (2*alas)+(2*tinggi);
        System.out.println("Luas Jajar Genjang = "+keliling);
    }
}
