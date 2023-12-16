
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MY ASUS
 */
public class CaesarCipher {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan pesan : ");
        String message = input.nextLine();
        System.out.print("Masukkan shift : ");
        int shift = input.nextInt();

        String ciphertext = encrypt(message, shift);
        System.out.println("Ciphertext: " + ciphertext);

        String plaintext = decrypt(ciphertext, shift);
        System.out.println("Plaintext: " + plaintext);
    }

    public static String encrypt(String message, int shift) {
        String plaintext = message.toUpperCase();
        char[] charArray = plaintext.toCharArray();
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            int a = (int) charArray[i] - 65;
            int c = a;
            if (a >= 0 && a < 26) {
                c = (a + shift) % 26;
            }
            c = c + 65;
            b.append((char) c);
        }
        String ciphertext = b.toString();
        return ciphertext;
    }

    public static String decrypt(String message, int shift) {
        String ciphertext = message.toUpperCase();
        char[] charArray = ciphertext.toCharArray();
        StringBuilder b = new StringBuilder();
        for (int i = 0; i < charArray.length; i++) {
            int c = (int) charArray[i] - 65;
            int a = c;
            if (c >= 0 && c < 26) {
                a = (c - shift) % 26;
                if (a < 0) {
                    a = 26 + a;

                }
            }
            a = a + 65;
            b.append((char) a);
        }
        String plaintext = b.toString();
        return plaintext;
    }
}
