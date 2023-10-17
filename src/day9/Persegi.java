package day9;

public class Persegi {
    int panjang_sisi;

    public void setPanjang_sisi(int panjang_sisi) {
        this.panjang_sisi = panjang_sisi;
    }
    
    void hitungLuas(){
        int luas = panjang_sisi * panjang_sisi;
        System.out.println("Luas Persegi = "+luas);
    }
    
    void hitungKeliling(){
        int keliling = panjang_sisi * 4;
        System.out.println("Keliling Persegi = "+keliling);
    }
}
