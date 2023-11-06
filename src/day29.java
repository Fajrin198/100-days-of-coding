
import java.util.Scanner;

public class day29 {
    public static void main(String[] args) {
        // Membeuat Pola jajargenjang
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan tinggi : ");
        int tinggi = sc.nextInt();
        for (int i = 0; i < tinggi; i++) {
            for (int j = 0; j < tinggi-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i+1; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < tinggi; j++) {
                System.out.print("*");
            }
            for (int j = 0; j < tinggi-i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
