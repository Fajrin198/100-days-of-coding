/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package day44;

/**
 *
 * @author MY ASUS
 */
public class Main {
    public static void main(String[] args) {
        double[] data = {23.4, 4.89, 1.25, 9.38, 3.14, 22.7};
        double sum = 0;
        for(int i=0; i<data.length; i++){
            sum += data[i];
        }
        System.out.println(sum/data.length);
    }
}
