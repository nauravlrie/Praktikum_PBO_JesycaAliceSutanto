package JobsheetW04;

import java.util.ArrayList;
public class Pesanan {
    private String idPesanan;
    private String tanggal;
    private Pelanggan pelanggan;
    private ArrayList<DetailPesanan> daftarDetail;

    public Pesanan(String idPesanan, String tanggal, Pelanggan pelanggan) {
        this.idPesanan = idPesanan;
        this.tanggal = tanggal;
        this.pelanggan = pelanggan;
        this.daftarDetail = new ArrayList<DetailPesanan>();
    }

    public void tambahDetail(DetailPesanan detail) {
        daftarDetail.add(detail);
    }
    public void tambahDetail(Bunga bunga, int jumlah) {
        DetailPesanan detail = new DetailPesanan(bunga, jumlah);
        daftarDetail.add(detail);
    }
    public double hitungTotal(){
        double total=0;
        for(DetailPesanan detail : daftarDetail) {
            total += detail.hitungSubtotal();
        }
        return total;
    }
    public void cetakStruk() {
        System.out.println("========================================");
        System.out.println("             BLOOM FLORIST              ");
        System.out.println("========================================");
        System.out.println("ID Pesanan : " + idPesanan);
        System.out.println("Tanggal    : " + tanggal);
        System.out.println("Pelanggan  : " + pelanggan.getNama() + " (" + pelanggan.getIdPelanggan() + ")");
        System.out.println("Telepon    : " + pelanggan.getNoTelepon());
        System.out.println("Alamat     : " + pelanggan.getAlamat());
        System.out.println("----------------------------------------");
        System.out.println("Rincian Pesanan:");

        for (DetailPesanan detail : daftarDetail) {
            System.out.println(detail.getInfo());
        }
        System.out.println("----------------------------------------");
        System.out.println("          TOTAL BAYAR: Rp " + (int) hitungTotal());
        System.out.println("========================================");
    
    }
}

