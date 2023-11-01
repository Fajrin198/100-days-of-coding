
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY ASUS
 */
public class day24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int[] data = new int[a];
        // input Array 1D
        for(int i=0; i<a; i++){
            int inputdata = input.nextInt();
            data[i] = inputdata;
        }
        int m = input.nextByte();
        int[][] data2D = new int[m][];
        int k = 0;
        // Masukkan nilai Array 1D ke dalam Array 2D
        for(int i=0; i<m; i++){
            int kolom = (int)Math.ceil((double)(data.length-k)/(m-i));
            for(int j=0; j<kolom; j++){
                data2D[j][i] = data[k];
                k++;
            }
        }
        // Output
        for(int i=0; i<data2D.length; i++){
            for(int j=0; j<data2D[i].length; j++){
                if(j==0){
                    System.out.print("[");
                }
                System.out.print(data2D[i][j]);
                if(j>data2D[i].length-2){
                    System.out.print("]");
                }else{
                    System.out.print(", ");
                }
            }
            System.out.println();
        }    
    }
}
