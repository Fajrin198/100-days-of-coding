
import java.util.HashMap;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author MY ASUS
 */
public class Day84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,String> data = new HashMap();
        int i = 1;
        while(true){
            System.out.println("Mahasiswa "+i+" -----------");
            System.out.print("Nama : ");
            String inputNama = sc.nextLine();
            if(inputNama.equalsIgnoreCase("Exit")){
                break;
            }
            System.out.print("NIM  : ");
            String inputNIM = sc.nextLine();
            if(data.containsKey(inputNIM)){
                System.out.println("Data NIM sudah ada");
            }else{
                data.put(inputNIM, inputNama);
                i++;
            }
            System.out.println();
        }
        System.out.println(data);
    }
}
