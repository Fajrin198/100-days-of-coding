public class day36 {
    public static void main(String[] args) {
        // Latihan membuat pola
        
        // Pola segitiga sama sisi
        
//                 *
//                ***
//               *****
//              *******
//             *********
//            ***********
//           *************
//          ***************
//         *****************
//        *******************
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10-i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < ((i+1)*2-1); j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
