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
    String nama     = bunga.getNamaBunga();
    int harga       = (int) bunga.getHarga();
    int subtotal    = (int) hitungSubtotal();
    String hasil = "  - " + nama;
    hasil += " (" + jumlah + " tangkai)";
    hasil += " x Rp " + harga;
    hasil += " = Rp " + subtotal;
    return hasil;
    }
}