
import java.util.Arrays;

public class Day96 {

    public static void main(String[] args) {

        int[] count = {12, 13, 76, 93, 38, 29, 40};
        // 1. menggunakan for loop
        for (int i = 0; i < count.length; i++) {
            System.out.println(count[i]);
        }
        // 2. menggunakan for-each loop
        for (int element : count) {
            System.out.println(element);
        }
        // 3. Menggunakan while loop
        int i = 0;
        while (i < count.length) {
            System.out.println(count[i]);
            i++;
        }
        // 4. Menggunakan Do-While loop
        int j = 0;
        do {
            System.out.println(count[j]);
            j++;
        } while (j < count.length);

        // 5. Menggunakan class ArraystoString
        System.out.println(Arrays.toString(count));
    }

}
