/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day51;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MY ASUS
 */
public class Main {
    public static void main(String[] args) {
        // program untuk membaca file ke string dan menulis string ke file
        try {
            String kalimat = "kalimat yang ditambahkan lagi";
            // Membaca file menjadi string
            String text = Files.readString(Path.of("src/day51/data.tsp"));
            // Menulis String ke file
            Path file = Files.writeString(Path.of("src/day51/data.tsp"), text+kalimat);
            
            System.out.println(text);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
