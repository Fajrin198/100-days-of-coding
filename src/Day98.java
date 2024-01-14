

import java.util.Scanner;

public class Day98 {
    public static void main(String[] args) {
        
        Scanner scInt = new Scanner(System.in);
        Scanner scStr = new Scanner(System.in);
        int N = scInt.nextInt();
        String[] listkertas = new String[N];
        for (int i = 0; i < N; i++) {
            String baris = scStr.nextLine();
            listkertas[i] = baris;
        }
        
        for (int i = 0; i < listkertas.length; i++) {
            String[] PQM = listkertas[i].split(" ");
            int P = Integer.parseInt(PQM[0]);
            int Q = Integer.parseInt(PQM[1]);
            int M = Integer.parseInt(PQM[2]);
            while(true){
            P /= 2;
            M -= 1;
            if(M==0){
                break;
            }
            Q /= 2;
            M -= 1;
            if(M==0){
                break;
            }
        }
        System.out.println(Q+" "+P);
        }
    }
}
