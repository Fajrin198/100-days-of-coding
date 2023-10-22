package day14;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> nim = new HashSet();
        String input;
        while(!(input = sc.nextLine()).equalsIgnoreCase("Exit")){
            if(nim.contains(input)){
                System.out.println("NIM "+input+" Sudah ada didalam HashSet");
            }else{
                nim.add(input);
            }
        }
        System.out.println(nim);
    }
}
