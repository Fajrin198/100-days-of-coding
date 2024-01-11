

import java.util.Scanner;
import java.util.Stack;

public class Day95 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kata = sc.nextLine();
        Stack atak = new Stack();
        for (int i = 0; i < kata.length(); i++) {
            atak.push(kata.charAt(i));
        }
        while(!atak.empty()){
            System.out.print(atak.pop());
        }
        System.out.println();
        
    }
}
