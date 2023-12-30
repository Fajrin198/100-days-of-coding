package day83;

import java.io.File;
import java.util.Scanner;

public class BacaFile {
    public static void main(String[] args) {
        try {
            File file = new File("src/day83/data.tsp");
            Scanner sc = new Scanner(file);
            int lengthRow = 0;
            int lengthCol = 0;
            while(sc.hasNextLine()){
                String baris = sc.nextLine();
                lengthRow += 1;
                String[] nilaiBaris = baris.split(" ");
                lengthCol = nilaiBaris.length;
            }
            
            sc = new Scanner(file);
            int[][] arr2d = new int[lengthRow][lengthCol];
            for (int i = 0; i < arr2d.length; i++) {
                String baris = sc.nextLine();
                for (int j = 0; j < arr2d[i].length; j++) {
                    String[] nilaiBaris = baris.split(" ");
                    int valueInt = Integer.parseInt(nilaiBaris[j]);
                    arr2d[i][j] = valueInt;
                }
            }
            for (int i = 0; i < arr2d.length; i++) {
                for (int j = 0; j < arr2d[i].length; j++) {
                    System.out.print(arr2d[i][j]+" ");
                }
                System.out.println();
            }
        } catch (Exception e) {
        }
    }
}
