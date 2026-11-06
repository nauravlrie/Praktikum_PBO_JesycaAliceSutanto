package Praktikum08;

public abstract class Dessert {
    public String tepung;
    public String air;
    public String mentega;
    public String telur;

    public Dessert(String tepung, String air, String mentega, String telur) {
        this.tepung = tepung;
        this.air = air;
        this.mentega = mentega;
        this.telur = telur;
    }
    public abstract void buat();

    public void cetakInfo() {
        System.out.println("Tepung: " + this.tepung);
        System.out.println("Air: " + this.air);
        System.out.println("Mentega: " + this.mentega);
        System.out.println("Telur: " + this.telur);
    }
}
