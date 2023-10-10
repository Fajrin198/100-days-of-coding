package day2;

public class main {
    // Variabel Instance
    String nama = "Fajrin";
    int umur = 18;
    // Variabel Class
    static String alamat = "Campalagian";
    // String[] args -> Paramer
    public static void main(String[] args) {
        // Variabel Lokal
        String warna = "Merah";
        
        // Variabel class menggunakan modifier static sehingga langsung dapat
        // diakses ke method main tanpa harus instance class nyaa
        System.out.println(alamat);
        
        // Variabel Instance yaitu valiabel yang class nya harus di instance terlebihdahulu
        // agar dapat di akses di mothod main
        main vi = new main();
        System.out.println("Nama saya "+vi.nama+" umur "+vi.umur);
    }
}
