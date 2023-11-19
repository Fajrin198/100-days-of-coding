
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MY ASUS
 */
public class day42 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nilai n : ");
        int n = sc.nextInt();
        for (int i = 0; i <= n; i++) {
            int k = 1 + i;
            if (i == n) {
                k -= 1;
            }
            for (int j = 0; j <= k; j++) {
                System.out.print("+");
                if (j < k) {
                    System.out.print("---");
                }
            }
            System.out.println("");
            if (i < n) {
                for (int j = 0; j <= k; j++) {
                    System.out.print("|");
                    if (j < k) {
                        System.out.print("   ");
                    }
                }
                System.out.println("");
            }
        }

    }
}
