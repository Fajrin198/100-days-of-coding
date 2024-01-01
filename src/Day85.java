/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY ASUS
 */
public class Day85 {
    public static void main(String[] args) {
        char[] label = {'A','B','C','D'};
        int[][] adjacency = {
            {0,20,42,35},
            {20,0,30,34},
            {42,30,0,12},
            {35,34,12,0}
        };
        
        int[]solusi_1 = {0,1,2,3,0};// A-B-C-D-A
        int[]solusi_2 = {2,1,3,0,2};// C-B-D-A-C
         
        
        
        //Coba print solusi
        int size = solusi_2.length;
        for (int i = 0; i < size; i++) {
            int iVertex = solusi_2[i];
            char labelVertex = label[iVertex];
            System.out.print(labelVertex);
            if(i<size-1){
                System.out.print(" - ");
            }
        }
        
        //hitung jarak
        int sum_Jarak = 0;
        for (int i = 1; i < size; i++) {
            int iV0 = solusi_2[i-1];
            int iV1 = solusi_2[i];
            int jarak = adjacency[iV0][iV1];
            sum_Jarak += jarak;
        }
        System.out.println(" = "+sum_Jarak);
        
        
        
        
    }
}
