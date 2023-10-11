package day3;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Luas Permukaan(meter persegi) = ");
        double luas = sc.nextInt();
        System.out.print("Kecepatan Aliran Air(m/d) = ");
        double kecepatan = sc.nextInt();
        double debit_air = luas * kecepatan;
        
        System.out.println("Debit air adalah "+debit_air+" meter kubik per detik.");
        
    }
}
