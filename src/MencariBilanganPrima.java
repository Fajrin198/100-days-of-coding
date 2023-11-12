/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.util.Scanner;

/**
 *
 * @author MY ASUS
 */
public class MencariBilanganPrima {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = sc.nextInt();
        String keterangan = angka+" bukan bilangan prima";
        for (int i = 2; i <= angka; i++) {
            if(i != angka){
                int hasil = angka%i;
                if(hasil != 0){
                    keterangan = angka+" merupakan bilangan prima";
                }else{
                    keterangan = angka+" bukan bilangan prima";
                    break;
                    
                }
            }else{
                keterangan = angka+" merupakan bilangan prima";
            }
        }
        
        System.out.println(keterangan);
    }
}
