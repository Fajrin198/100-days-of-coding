
import java.util.Scanner;

public class day32 {
    public static void main(String[] args) {
        // Membuat pola trapesium
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tinggi : ");
        int tinggi = sc.nextInt();
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < tinggi-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < tinggi+tinggi; j++) {
                System.out.print("*");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
