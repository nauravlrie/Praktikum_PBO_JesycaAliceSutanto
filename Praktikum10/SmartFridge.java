package Praktikum10;

public class SmartFridge extends Kulkas implements Audible{
    public int volume;
    public String ukuranLayar;

    @Override
    public void naikkanVolume() {
        volume += 1;
    }
    @Override
    public void turunkanVolume() {
        volume -= 1;
    }
    @Override
    public String getInfo() {
        return "Ukuran Layar : " + this.ukuranLayar + "\n" +
               "Volume       : " + this.volume;
    }
}
