
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Day50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Masukkan angka : ");
            int angka = sc.nextInt();
            if(angka==0){
                System.out.println("Angka yang diinputkan tidak valid");
            }else if(angka%2 == 0){
                break;
            }
        }
    }
}
