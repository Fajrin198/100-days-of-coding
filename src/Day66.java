
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY ASUS
 */
public class Day66 {
    // Belajar operasi string
    public static void main(String[] args) {
        String kata = "Hallo";
        String kalimat = "Belajar operasi string";
        // Menjadikan string kalimat sebagai array
        String[] arrKata = kalimat.split(" ");
        System.out.println(Arrays.toString(arrKata));
        // Mengakses char pada index tertentu yang ada pada String
        char a = kata.charAt(2);
    }
}
