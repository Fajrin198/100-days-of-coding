/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BelajarAlgoritmaPengurutan;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {23,17,4,29,26,93,176,9,26,18,64,19,2};
        System.out.println("Sebelum di Sorting-----------");
        System.out.println(Arrays.toString(data));
        // Proses melakukan sorting menggunakan algoritma Selection sort pada array
        for(int i=0; i<data.length; i++){
            int min = i;
            for(int j=i+1; j<data.length; j++){
                if(data[j]<data[min]){
                    min = j;
                }
            }
            int temp = data[min];
            data[min] = data[i];
            data[i] = temp;
        }
        System.out.println("Setelah di Sorting-----------");
        System.out.println(Arrays.toString(data));
    }
}
