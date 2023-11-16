 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day40;

public class Main {
    public static void main(String[] args) {
        // Memeriksa nilai terkecil dari kumpulan nilai
        double[] data = {23.4, 4.89, 1.25, 9.38, 3.14, 22.7};
        double min = Double.MAX_VALUE;
        for(int i=0; i<data.length; i++){
            if(data[i]<min){
                min = data[i];
            }
        }
        System.out.println(min);
    }
}
