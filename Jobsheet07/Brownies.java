package Jobsheet07;

public class Brownies extends Dessert {
    public String cokelat;
    public String chocochips;
    public String krim;
    public String pengembang;

    public Brownies() {
        System.out.println("Objek dari class Brownies dibuat");
    }
    public Brownies(String tepung, String air, String mentega, String telur, String cokelat, String chocochips, String krim, String pengembang) {
        super(tepung, air, mentega, telur);
        this.cokelat = cokelat;
        this.chocochips = chocochips;
        this.krim = krim;
        this.pengembang = pengembang;
        
    }
    public String getInfo() {
        // String info = super.getInfo();
        String info = "";
        info += "Cokelat: " + this.cokelat + "\n";
        info += "Chocochips: " + this.chocochips + "\n";
        info += "Krim: " + this.krim + "\n";
        info += "Pengembang: " + this.pengembang + "\n";
        return info;
    }
}
