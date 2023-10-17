/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day9;

import java.util.Scanner;

/**
 *
 * @author MY ASUS
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Persegi persegi = new Persegi();
        System.out.print("Panjang sisi = ");
        int sisiPersegi = sc.nextInt();
        persegi.setPanjang_sisi(sisiPersegi);
        persegi.hitungLuas();
        persegi.hitungKeliling();
        System.out.println("");
        
        PersegiPanjang pp = new PersegiPanjang();
        System.out.print("Panjang = ");
        int panjang = sc.nextInt();
        System.out.print("Lebar = ");
        int lebar = sc.nextInt();
        pp.setLebar(panjang);
        pp.setPanjang(lebar);
        pp.Hitungluas();
        pp.Hitungkeliling();
        System.out.println("");
        
        Segitiga segitiga = new Segitiga();
        System.out.print("Alas = ");
        double alasSegitiga = sc.nextDouble();
        System.out.print("Tinggi = ");
        double tinggiSegitiga = sc.nextDouble();
        System.out.print("Sisi miring = ");
        double sisiMiringSegitiga = sc.nextDouble();
        segitiga.setAlas(alasSegitiga);
        segitiga.setSisiMiring(sisiMiringSegitiga);
        segitiga.setTinggi(tinggiSegitiga);
        segitiga.HitungLuas();
        segitiga.HitungKeliling();
        System.out.println("");
        
        Trapesium trapesium = new Trapesium();
        System.out.print("Tinggi = ");
        double tinggiTrapesium = sc.nextDouble();
        System.out.print("Sisi miring = ");
        double sisiMiringTrapesium = sc.nextDouble();
        System.out.print("Sisi atas = ");
        double sisiAtasTrapesium = sc.nextDouble();
        System.out.print("Sisi bawah = ");
        double sisiBawahTrapesium = sc.nextDouble();
        trapesium.setSisiAtas(sisiAtasTrapesium);
        trapesium.setSisiBawah(sisiBawahTrapesium);
        trapesium.setSisiMiring(sisiMiringTrapesium);
        trapesium.setTinggi(tinggiTrapesium);
        trapesium.hitungLuas();
        trapesium.hitungKeliling();
        System.out.println("");
        
        Lingkaran lingkaran = new Lingkaran();
        System.out.print("Jari-jari Lingkaran = ");
        double r = sc.nextDouble();
        lingkaran.setR(r);
        lingkaran.hitungLuas();
        lingkaran.hitungKeliling();
        System.out.println("");
        
        LayangLayang ll = new LayangLayang();
        System.out.print("Diagonal 1 = ");
        double d1layang = sc.nextDouble();
        System.out.print("Diagonal 2 = ");
        double d2layang = sc.nextDouble();
        System.out.print("Sisi atas = ");
        double sisiAtasLayang = sc.nextDouble();
        System.out.print("Sisi bawah = ");
        double sisiBawahLayang = sc.nextDouble();
        ll.setD1(d1layang);
        ll.setD2(d2layang);
        ll.setSisiMiringAtas(sisiAtasLayang);
        ll.setSisiMiringBawah(sisiBawahLayang);
        ll.hitungLuas();
        ll.hitungKeliling();
        System.out.println("");
        
        JajarGenjang jg = new JajarGenjang();
        System.out.print("Alas = ");
        double alasJG = sc.nextDouble();
        System.out.print("Tinggi = ");
        double tinggiJG = sc.nextDouble();
        System.out.print("Sisi miring = ");
        double sisiMiringJG = sc.nextDouble();
        jg.setAlas(alasJG);
        jg.setTinggi(tinggiJG);
        jg.setSisiMiring(sisiMiringJG);
        jg.hitungLuas();
        jg.hitungKeliling();
        System.out.println("");
        
        BelahKetupat bk = new BelahKetupat();
        System.out.print("Diagonal 1 = ");
        double d1BK = sc.nextDouble();
        System.out.print("Diagonal 2 = ");
        double d2BK = sc.nextDouble();
        System.out.print("Panjang Sisi = ");
        double sisiBK = sc.nextDouble();
        bk.setD1(d1BK);
        bk.setD2(d2BK);
        bk.setS(sisiBK);
        bk.hitungLuas();
        bk.hitungKeliling();
    }
}
