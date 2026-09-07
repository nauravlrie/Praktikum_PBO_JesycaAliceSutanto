package Praktikum03;

public class Anggota {
    private String nomorKTP;
    private String nama;
    private int limitPeminjaman;
    private int jumlahPinjaman;

    public Anggota(String nomorKTP, String nama, int limitPeminjaman) {
        this.nomorKTP = nomorKTP;
        this.nama = nama;
        this.limitPeminjaman = limitPeminjaman;
        this.jumlahPinjaman = 0;
    }

    public String getNomorKTP() {
        return this.nomorKTP;
    }

    public String getNama() {
        return this.nama;
    }

    public int getLimitPinjaman() {
        return this.limitPeminjaman;
    }

    public int getJumlahPinjaman() {
        return this.jumlahPinjaman;
    }

    public void pinjam(int nominal) {
        if (this.jumlahPinjaman + nominal > this.limitPeminjaman) {
            System.out.println("Jumlah pinjaman melebihi limit.");
        } else {
            this.jumlahPinjaman += nominal;
        }
    }

    public void angsur(int nominal) {
        if (nominal < (0.1 * this.jumlahPinjaman)) {
            System.out.println("Maaf, angsuran harus 10% dari jumlah pinjaman");
        }else {
            this.jumlahPinjaman -= nominal;
        }
    }
}
