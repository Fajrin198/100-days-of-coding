/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY ASUS
 */
public class Day41 {
    public static void main(String[] args) {
        double[] data = {2.09, 3.87,6.32, 7.01, 4.0, 1.23};
        sortingBubleSort(data);
        for(int i=0; i<data.length; i++){
            System.out.print(data[i]+", ");
        }
    }
    
    public static void sortingBubleSort(double[] data){
        for(int i=0; i<data.length-1; i++){
            for(int j=0; j<data.length-i-1; j++){
                if(data[j]>data[j+1]){
                    double temp = data[j];
                    data[j] = data[j+1];
                    data[j+1] = temp;
                }
            }
        }
        
    }
}
