import java.util.Scanner;

public class VigenereCipher {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String message = input.nextLine();
        String keyword = input.nextLine();
        String ciphertext = encrypt(message, keyword);
        System.out.println(ciphertext);
        String plaintext = decrypt(ciphertext, keyword);
        System.out.println(plaintext);
    }
    public static String encrypt(String message, String keyword){
        String plaintext = message.toUpperCase();
        char[] charArray = plaintext.toCharArray();
        char[] keyArray = keyword.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<charArray.length; i++){
            int p = (int) charArray[i]-65;
            int k = i%keyArray.length;
            int key = (int)keyArray[k]-65;
            int c = p;
            if (p>=0 && p<26 && key>=0 && key<26){
                c= (p+key)%26;
            }
            c = c+65;
            sb.append((char)c);
        }
        String ciphertext = sb.toString();
        return ciphertext;
        
    }
    public static String decrypt(String message, String keyword){
        String ciphertext = message.toUpperCase();
        keyword = keyword.toUpperCase();
        char[] charArray = ciphertext.toCharArray();
        char[] keyArray = keyword.toCharArray();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<charArray.length; i++){
            int c = (int) charArray[i]-65;
            int k = i%keyArray.length;
            int key = (int)keyArray[k]-65;
            int p = c;
            if (c>=0 && c<26 && key>=0 && key<26){
                p= (c+key)%26;
                if (p<0){
                    p = 26+p;
                }
            }
            p = p+65;
            sb.append((char)p);
        }
        String plaintext = sb.toString();
        return plaintext;
    }
}
