package day1;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList data = new ArrayList();
        System.out.print("Masukkan nilai a = ");
        int a = sc.nextInt();
        data.add(a);
        System.out.print("Masukkan nilai b = ");
        int b = sc.nextInt();
        data.add(b);
        System.out.print("Masukkan nilai c = ");
        int c = sc.nextInt();
        data.add(c);
        System.out.print("Masukkan nilai d = ");
        int d = sc.nextInt();
        data.add(d);
        System.out.print("Masukkan nilai e = ");
        int e = sc.nextInt();
        data.add(e);
        
        int min = a;
        int max = a;
        
        for (int i = 0; i < data.size(); i++){
            if((int)data.get(i) > max){
                max = (int)data.get(i);
            }else if((int)data.get(i) < min){
                min = (int)data.get(i);
            }
        }
        System.out.println("Max = "+max);
        System.out.println("Min = "+min);
    }
}
