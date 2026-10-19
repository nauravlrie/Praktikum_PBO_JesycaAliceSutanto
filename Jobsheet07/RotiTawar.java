package Jobsheet07;

public class RotiTawar extends Dessert {
    public String ragi;
    public String bijiBijian;

    public RotiTawar() {
        System.out.println("Objek dari class RotiTawar dibuat");
    }
    public RotiTawar(String tepung, String air, String mentega, String telur, String ragi, String bijiBijian) {
        super(tepung, air, mentega, telur);
        this.ragi = ragi;
        this.bijiBijian = bijiBijian;
    }
    public String getInfo() {
        String info = "";
        info += "Ragi:" + this.ragi + "\n";
        info += "Biji-bijian: " + this.bijiBijian + "\n";
        return info;
    }
}
