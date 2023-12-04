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
public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {23,17,4,29,26,93,176,9,26,18,64,19,2};
        System.out.println("Sebelum di Sorting-----------");
        System.out.println(Arrays.toString(data));
        // Proses melakukan sorting menggunakan algoritma Insertion sort pada array
        for (int i = 1; i < data.length; i++) {
          int key = data[i];
          int j = i - 1;

          while (j >= 0 && data[j] > key) {
            data[j+1] = data[j];
            j--;
          }
          data[j+1] = key;
        }
        System.out.println("Setelah di Sorting-----------");
        System.out.println(Arrays.toString(data));
    }
}
