

import java.util.ArrayList;
import java.util.Scanner;

public class Day94 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        ArrayList<String> data01 = new ArrayList<String>();
        // input
        while(true){
            String data = input.nextLine();
            if(data.equalsIgnoreCase("EXIT")){
                break;
            }
            data01.add(data);
            
        }
        System.out.println(data01);
        
        
    }
    
}
