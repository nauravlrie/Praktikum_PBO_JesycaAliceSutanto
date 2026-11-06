package Praktikum08;

public class Brownies extends Dessert {
    public String cokelat;
    public String chococips;

    public Brownies(String cokelat, String chococips, String tepung, String air, String mentega, String telur) {
        super(tepung, air, mentega, telur);
        this.cokelat = cokelat;
        this.chococips = chococips;
    }
    @Override
    public void buat() {
        System.out.println("Melelehkan cokelat batangan bersama mentega dengan teknik double boiler");
        System.out.println("Mengocok telur, mencampur tepung perlahan, dan menambahkan chococips");
        System.out.println("Memanggang dalam oven 180 derajat Celcius hingga terbentuk shiny crust");
    }

    @Override   
    public void cetakInfo() {
        // super.cetakInfo();
        System.out.println("Cokelat: " + this.cokelat);
        System.out.println("Chococips: " + this.chococips);
    }
}
