package Praktikum08;

public class RotiTawar extends Dessert {
    public String ragi;
    public String bijiBijian;

    public RotiTawar(String ragi, String bijiBijian, String tepung, String air, String mentega, String telur) {
        super(tepung, air, mentega, telur);
        this.ragi = ragi;
        this.bijiBijian = bijiBijian;
    }
    @Override 
    public void buat() {
        System.out.println("Mencampurkan tepung, air, dan ragi hingga kalis elastis");
        System.out.println("Mendiamkan adonan hingga mengembang dua kali lipat(proofing)");
        System.out.println("Memanggang adonan di dalam loyang balok hingga matang kecokelatan");
    }

    @Override 
    public void cetakInfo() {
        //super.cetakInfo();
        System.out.println("Ragi: " + this.ragi);
        System.out.println("Biji-bijian: " + this.bijiBijian);
    }
}
