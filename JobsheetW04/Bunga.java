package JobsheetW04;

public class Bunga {
    private String kodeBunga;
    private String namaBunga;
    private double harga;

    public Bunga(String kodeBunga, String namaBunga, double harga) {
        this.kodeBunga = kodeBunga;
        this.namaBunga = namaBunga;
        this.harga = harga;
    }

    public String getKodeBunga() {
        return kodeBunga;
    }
    public void setKodeBunga(String kodeBunga) {
        this.kodeBunga = kodeBunga;
    }
    public String getNamaBunga() {
        return namaBunga;
    }
    public void setNamaBunga(String namaBunga) {
        this.namaBunga = namaBunga;
    }
    public double getHarga() {
        return harga;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public String getInfo() {
        return namaBunga + "(" + kodeBunga + ") @Rp" + String.format("%,.Of", harga);
    }
}
