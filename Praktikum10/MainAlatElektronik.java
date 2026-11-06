package Praktikum10;

public class MainAlatElektronik {
    public static void main(String[] args) {
        
        Kulkas kulkas1 = new Kulkas();
        kulkas1.merk = "LG";
        kulkas1.warna = "Silver";
        kulkas1.harga = 5000000;
        kulkas1.jumlahPintu =2;

        System.out.println("=== Info Kulkas ===");
        System.out.println(kulkas1.getInfo());

        TV tv1 = new TV();
        tv1.merk = "Samsung";
        tv1.warna = "Hitam";
        tv1.harga = 30000000;
        tv1.jenisLayar = "OLED";
        tv1.volume = 20;

        tv1.naikkanVolume();
        tv1.naikkanVolume();

        System.out.println("=== Info TV ===");
        System.out.println(tv1.getInfo());
    }
}
