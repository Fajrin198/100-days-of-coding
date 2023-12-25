

import java.util.Scanner;

public class Day78 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int hasil = 0;
        if(m<n){
            for(int i=m+1; i<n; i++){
                System.out.print(i);
                if(i<n-1){
                    System.out.print(" + ");
                }
                hasil += i;
            }
        }else{
            for(int i=n+1; i<m; i++){
                System.out.print(i);
                if(i<m-1){
                    System.out.print(" + ");
                }
                hasil += i;
            }
        }
        System.out.print(" = "+hasil);
        System.out.println();
    }
}
