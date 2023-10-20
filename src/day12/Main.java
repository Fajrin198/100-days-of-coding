/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day12;

/**
 *
 * @author MY ASUS
 */
public class Main {
    public static void main(String[] args) {
        double[][] arr2D = {{91.35, 4.72, 26, 3.5, 8, 61, 65.36, 12, 5.6, 7.11},
                            {27, 9.53, 549, 2.23, 17.31, 4.25, 2.13, 83, 7, 102.4},
                            {53.21, 3.42, 0.21, 70.02, 819.4, 6173, 4.25, 19.8, 17.35, 5.768}};
        double min = arr2D[0][0];
        double max = arr2D[0][0];
        double sum = 0;
        double count = 0;
        
        for (int i = 0; i < arr2D.length; i++) {
            System.out.print("[");
            for (int j = 0; j < arr2D[i].length; j++) {
                if(j>0){
                    System.out.print(" ");
                }
                System.out.print(arr2D[i][j]);
                if(arr2D[i][j] > max){
                    max = arr2D[i][j];
                }else if(arr2D[i][j] < min){
                    min = arr2D[i][j];
                }
                sum += arr2D[i][j];
                count++;
            }
            System.out.println("]");
        }
        double avarange = sum/count;
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
        System.out.println("Sum = "+sum);
        System.out.println("Avarange = "+avarange);
    }
}
