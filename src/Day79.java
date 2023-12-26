

import java.util.Scanner;

public class Day79 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String kalimat = sc.nextLine();
        String kalimatBaru = "";
        for(int i=0; i<=(kalimat.length()-1); i++){
            char karakter = kalimat.charAt(i);
            if(karakter=='a'){
                kalimatBaru += "apa";
            }else if(karakter=='A'){
               kalimatBaru += "APA";
            }else if(karakter=='i'){
                kalimatBaru += "ipi";
            }else if(karakter=='u'){
                kalimatBaru += "upu";
            }else if(karakter=='e'){
                kalimatBaru += "epe";
            }else if(karakter=='o'){
                kalimatBaru += "opo";
            }else{
                kalimatBaru += karakter;
            }
        }
        System.out.println(kalimatBaru);
        
    }
}
