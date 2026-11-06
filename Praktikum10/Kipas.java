package Praktikum10;

public class Kipas extends AlatElektronik {
    public String jenis;

    @Override
    public String getInfo() {
        return "Jenis        : " + this.jenis;
    }
}
