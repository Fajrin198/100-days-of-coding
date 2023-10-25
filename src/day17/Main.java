/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day17;

/**
 *
 * @author MY ASUS
 */
public class Main {
    public static void main(String[] args) {
        int[][] arr2D = {{1,1,1},
                        {1,3,1},
                        {1,1,1}};
        int size = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                size++;
            }
        }
        int k = 0;
        int[] arr1D = new int[size];
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                arr1D[k] = arr2D[i][j];
                k++;
            }
        }
        
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int sum = 0;
        
        for (int i = 0; i < arr1D.length; i++) {
            System.out.print(arr1D[i]+" ");
            if(arr1D[i]>max){
                max = arr1D[i];
            }
            if(arr1D[i]<min){
                min = arr1D[i];
            }
            sum += arr1D[i];
        }
        System.out.println("");
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
        System.out.println("Sum = "+sum);
        double avarage = (double)sum/arr1D.length;
        System.out.println("Avarage = "+avarage);
        
        
    }
}
