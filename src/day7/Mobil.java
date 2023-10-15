package day7;

public class Mobil {
    String warna = "Merah";
    double kapasitasBahanBakar = 50;
    double kecepatan;
    
    void speedUp(double increment){
        kecepatan += increment;
    }
    
    void applyBrakes(double decrement){
        kecepatan -= decrement;
    }
    
    void printStates(){
        System.out.println("Warna = "+warna);
        System.out.println("Kapasitas bahan bakar = "+kapasitasBahanBakar+" Liter");
        System.out.println("Kecepatan = "+kecepatan);
    }
}
