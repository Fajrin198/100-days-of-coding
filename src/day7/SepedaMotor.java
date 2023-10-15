package day7;

public class SepedaMotor {
    String warna = "Hitam";
    String jenisTransmisi = "Otomatis";
    double kapasitasBahanBakar = 8;
    double kecepatan;
    
    void speedUp(double increment){
        kecepatan += increment;
    }
    
    void applyBrakes(double decrement){
        kecepatan -= decrement;
    }
    
    void printStates(){
        System.out.println("Warna = "+warna);
        System.out.println("Jenis Transmisi = "+jenisTransmisi);
        System.out.println("Kapasitas bahan bakar = "+kapasitasBahanBakar+" Liter");
        System.out.println("Kecepatan = "+kecepatan);
    }
}
