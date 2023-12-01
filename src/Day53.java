


public class Day53 {
    public static void main(String[] args) {
        // Latihan membaca error
        try {
            int a = 5;
//            System.out.cetak(a);
        } catch (Exception e) {
            System.err.println("DITEMUKAN ERROR PROGRAM");
            System.out.println(e.getLocalizedMessage());
            Throwable fillInStackTrace = e.fillInStackTrace();
            System.out.println(fillInStackTrace);
            System.out.println(e.getMessage());
        }
    }
}
