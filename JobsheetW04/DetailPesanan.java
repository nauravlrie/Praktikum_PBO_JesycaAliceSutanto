package JobsheetW04;

public class DetailPesanan {
    private Bunga bunga;
    private int jumlah;

    public DetailPesanan(Bunga bunga, int jumlah) {
        this.bunga = bunga;
        this.jumlah = jumlah;
    }

    public Bunga getBunga() {
        return bunga;
    }

    public void setBunga(Bunga bunga) {
        this.bunga = bunga;
    }

    public int getJumlah() {
        return jumlah;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public double hitungSubtotal() {
        return jumlah * bunga.getHarga();
    }

     public String getInfo() {
        return "  - " + bunga.getNamaBunga() + " (" + jumlah + " tangkai) x Rp " + (int) bunga.getHarga() + " = Rp " + (int) hitungSubtotal();
    }
}