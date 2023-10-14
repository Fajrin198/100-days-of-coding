package day6;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        PersegiPanjang balok1 = new PersegiPanjang();
        System.out.print("Masukkan Panjang = ");
        int panjang = sc.nextInt();
        balok1.setPanjang(panjang);
        System.out.print("Masukkan Lebar = ");
        int lebar = sc.nextInt();
        balok1.setLebar(lebar);
        balok1.luas();
        balok1.keliling();
        
    }
}
