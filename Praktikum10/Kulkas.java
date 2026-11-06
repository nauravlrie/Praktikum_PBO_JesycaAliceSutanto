package Praktikum10;

public class Kulkas extends AlatElektronik {
    public int jumlahPintu;

     @Override
    public String getInfo() {
        return "Jumlah Pintu : " + this.jumlahPintu;
    }
}
