/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY ASUS
 */
public class day27 {
    public static void main(String[] args) {
        // Segitiga siku-siku
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        // segitiga sama sisi
        for (int i = 1; i <= 5; i++) {
            for (int j = 0; j < 5-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(i*2-1) ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
