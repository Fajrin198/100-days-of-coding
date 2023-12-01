
import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] dataArr = new int[m][n];
        
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print("element{"+i+","+j+"] = ");
                int element = sc.nextInt();
                dataArr[i][j] = element;
            }
        }
        
        for(int i=0; i<dataArr.length; i++){
            System.out.print("|");
            for(int j=0; j<dataArr[i].length; j++){
                System.out.print(dataArr[i][j]+"|");
            }
            System.out.println();
        }   
    }
}
