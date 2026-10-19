package Jobsheet07;

public class Dessert {
    public String tepung;
    public String air;
    public String mentega;
    public String telur;

    public Dessert() {
        System.out.println("Objek dari class Dessert dibuat");
    }
    public Dessert(String tepung, String air, String mentega, String telur) {
        this.tepung = tepung;
        this.air = air;
        this.mentega = mentega;
        this.telur = telur;
    }
    public String getInfo() {
        String info ="";
        info += "Tepung: " + tepung + "\n";
        info += "Air: " + air + "\n";
        info += "Mentega: " + mentega + "\n";
        info += "Telur: " + telur + "\n";
        return info;
    }
}
