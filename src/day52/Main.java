package day52;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Buat array untuk menyimpan string dan angka
        ArrayList<String> arrayString = new ArrayList<>();
        ArrayList<Integer> arrayAngka = new ArrayList<>();

        // Buat objek Scanner untuk menerima input
        Scanner scanner = new Scanner(System.in);

        // Lakukan loop sampai pengguna mengetik 'selesai'
        while (true) {
            // Menerima input selanjutnya
            System.out.print("Masukkan data (string/angka) atau ketik 'selesai' untuk mengakhiri: ");
            String input = scanner.nextLine();
            
            //untuk menghentikan loop jika yang di inputkan adalah kata 'selesai'
            if(input.equalsIgnoreCase("selesai")){
                break;
            }
            // Cek tipe data input
            try {
                // Jika input bertipe angka, tambahkan ke array angka
                int angka = Integer.parseInt(input);
                arrayAngka.add(angka);
            } catch (NumberFormatException e) {
                // Jika input bukan angka, tambahkan ke array string
                arrayString.add(input);
            }

        }

        // Menampilkan hasil
        System.out.println("Data String: " + arrayString);
        System.out.println("Data Angka: " + arrayAngka);
    }
}
