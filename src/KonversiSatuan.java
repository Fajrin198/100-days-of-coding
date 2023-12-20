
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author MY ASUS
 */
public class KonversiSatuan {

    public static void main(String[] args) {
//        double nilai = 10;
//        Scanner sc = new Scanner(System.in);
//        String inputSatuan01 = sc.nextLine();
//        String inputSatuan02 = sc.nextLine();
//        String[] satuan = {"km", "hm", "dam", "m", "dm", "cm", "mm"};
        double a = Math.pow(10, 3);
        System.out.println(a);
        double hasil = convert(1,3,3);
        System.out.println(hasil);
//        int nilaiAwal = 0;
//        int nilaiAkhir = 0;
//        for (int i = 0; i < satuan.length; i++) {
//            if (!(inputSatuan01.equalsIgnoreCase(satuan[i]))) {
//                nilaiAwal++;
//            } else {
//                break;
//            }
//        }
//        for (int i = 0; i < satuan.length; i++) {
//            if (!(inputSatuan02.equalsIgnoreCase(satuan[i]))) {
//                nilaiAkhir++;
//            } else {
//                break;
//            }
//        }
//        System.out.println(nilaiAwal);
//        System.out.println(nilaiAkhir);
//        if (nilaiAwal < nilaiAkhir) {
//            for (int j = nilaiAwal; j < nilaiAkhir; j++) {
//                nilai *= 10;
//            }
//        } else {
//            System.out.println(nilai);
//            System.out.println(nilaiAwal);
//            System.out.println(nilaiAkhir);
//            for (int j = nilaiAwal; j > nilaiAkhir; j--) {
//                nilai /= 10.0;
//            }
//        }
//        System.out.println(1/1000000.0);
//        System.out.println(nilai);
    }
    
    private static double convert(int dari, int ke,double value){
        double result = 0;
        double km = value/Math.pow(10, dari);
        result = km*Math.pow(10, ke);
        
        return result;
    }
}
