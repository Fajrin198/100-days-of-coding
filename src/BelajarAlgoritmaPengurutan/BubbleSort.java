/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BelajarAlgoritmaPengurutan;

import java.util.Arrays;

/**
 *
 * @author MY ASUS
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {23,17,4,29,26,93,176,9,26,18,64,19,2};
        System.out.println("Setelah di Sorting-----------");
        System.out.println(Arrays.toString(data));
        // Proses melakukan sorting menggunakan algoritma Buble sort pada array
        for(int i=0; i<data.length; i++){
            for (int j = 0; j < data.length-i-1; j++) {
                if(data[j]>data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        System.out.println("Setelah di Sorting secara ascending-----------");
        System.out.println(Arrays.toString(data));
        for(int i=0; i<data.length; i++){
            for (int j = 0; j < data.length-i-1; j++) {
                if(data[j]<data[j+1]){
                    int temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        System.out.println("Setelah di Sorting secara descending-----------");
        System.out.println(Arrays.toString(data));
    }
}
