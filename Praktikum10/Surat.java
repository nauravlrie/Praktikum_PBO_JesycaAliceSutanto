package Praktikum10;

public class Surat implements Sendable {
    private String pengirim;
    private String alamatTujuan;
    private String isiSurat;

    public Surat(String pengirim, String alamatTujuan, String isiSurat) {
        this.pengirim = pengirim;
        this.alamatTujuan = alamatTujuan;
        this.isiSurat = isiSurat;
    }
    @Override 
    public void kirim() {
        System.out.println("Surat dari" + this.pengirim+ "dimasukkan ke amplop dan diserahkan ke kurir pos.");
    }

    @Override 
    public void cekStatusPengiriman() {
        System.out.println("Status: Surat fisik sedang dalam perjalanan menuju " + this.alamatTujuan);
    }

    public String getInfo() {
        return "Pengirim       : " + this.pengirim + "\n" +
               "Alamat Tujuan  : " + this.alamatTujuan + "\n" +
               "Isi Surat      : " + this.isiSurat;
    }
}
