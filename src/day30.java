
import java.util.Scanner;

public class day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("<===== STRUK GAJI KARYAWAN =====>");
        System.out.print("Jumlah Hari Kerja   : ");
        int hariKerja = sc.nextInt();
        System.out.print("Gaji Perhari        : ");
        int gajiPerhari = sc.nextInt();
        System.out.print("Uang Makan Perhari  : ");
        int uangMakanPerhari = sc.nextInt();
        int gajiKotor = gajiPerhari*hariKerja;
        System.out.println("Gaji Kotor          : "+gajiKotor);
        int totalUangMakan = uangMakanPerhari*hariKerja;
        System.out.println("Total Uang Makan    : "+totalUangMakan);
        System.out.println("Gaji Bersih         : "+(gajiKotor-totalUangMakan));
    }
}
