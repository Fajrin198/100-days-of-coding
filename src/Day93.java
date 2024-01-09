

import java.util.Scanner;

public class Day93 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int[][] dataArr1 = new int[m][];
        
        for(int i=0; i<m; i++){
            int n = sc.nextInt();
            int[][] dataArr = new int[m][n];
            for(int j=0; j<n; j++){
                System.out.print("element{"+i+","+j+"] = ");
                int element = sc.nextInt();
                dataArr[i][j] = element;
            }
            dataArr1[i] = dataArr[i];
        }
        
        for(int i=0; i<dataArr1.length; i++){
            System.out.print("|");
            for(int j=0; j<dataArr1[i].length; j++){
                System.out.print(dataArr1[i][j]+"|");
            }
            System.out.println();
        }   
    }
}
