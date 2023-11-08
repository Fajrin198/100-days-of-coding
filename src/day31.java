
import java.util.Scanner;

public class day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah karyawan : ");
        int jumlahKaryawan = sc.nextInt();
        System.out.println("Jumlah hari kerja");
        int[] jumlahHariKerja = new int[jumlahKaryawan];
        for (int i = 0; i < jumlahKaryawan; i++) {
            System.out.print("Karyawan "+(i+1)+" = ");
            jumlahHariKerja[i] = sc.nextInt();
        }
        System.out.println();
        int gajiKotorPerhari = 120000;
        int UangMakanPerhari = 15000;
        int gajiBersihPerhari = gajiKotorPerhari-UangMakanPerhari;
        int totalUangUntukMenggajiSemuaKaryawan = 0;
        System.out.println("<==== GAJI BERSIH KARYAWAN ====>");
        for (int i = 0; i < jumlahKaryawan; i++) {
            int gajiBersihKaryawan = jumlahHariKerja[i]*gajiBersihPerhari;
            System.out.println("Karyawan "+(i+1)+" = "+gajiBersihKaryawan);
            totalUangUntukMenggajiSemuaKaryawan += gajiBersihKaryawan;
        }
        System.out.println("--------------------------------");
        System.out.println("Jumlah uang yang diperlukan untuk menggaji karyawan = "+totalUangUntukMenggajiSemuaKaryawan);
    }
}
