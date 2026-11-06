package Praktikum10;

public class AlatElektronik {
    public double harga;
    public String merk;
    public String warna;

    public String getInfo() {
        return  "Merk: " + this.merk + "\n" +
                "Warna: " + this.warna + "\n" +
                "Harga: Rp" + this.harga;
    }
}
