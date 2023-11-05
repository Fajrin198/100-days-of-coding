public class day28 {
    public static void main(String[] args) {
        // Membuat Pola Belah Ketupat
        
        int panjang = 5;
        for (int i = 1; i <= panjang-1; i++) {
            for (int j = 0; j < panjang-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=(i*2-1) ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i = 1; i <= panjang; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=((panjang*2)-(i*2))+1 ; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
