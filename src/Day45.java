
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY ASUS
 */
public class Day45 {
    // membuat program yang menjumlahkan bilangan dari nilai ke m sampai dengan nilai ke n
    // input
    // m = 2
    // n = 5
    // output
    // 2 + 3 + 4 + 5 = 14
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("m = ");
        int m = sc.nextInt();
        System.out.print("n = ");
        int n = sc.nextInt();
        int hasil = 0;
        for (int i = m; i <= n; i++) {
            if(i>m){
                System.out.print(" + ");
            }
            System.out.print(i);
            hasil += i;
        }
        System.out.print(" = ");
        System.out.print(hasil);
        System.out.println("");
    }
}
