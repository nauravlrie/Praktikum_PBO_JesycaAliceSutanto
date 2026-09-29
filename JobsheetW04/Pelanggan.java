package JobsheetW04;

public class Pelanggan {
    private String idPelanggan;
    private String nama;
    private String noTelepon;
    private String alamat;

    public Pelanggan(String idPelanggan, String nama, String noTelepon, String alamat) {
        this.idPelanggan = idPelanggan;
        this.nama = nama;
        this.noTelepon = noTelepon;
        this.alamat = alamat;    
    }

    public String getIdPelanggan() {
        return idPelanggan;
    }
    public void setIdPelanggan(String idPelanggan) {
        this.idPelanggan = idPelanggan;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getNoTelepon(){
        return noTelepon;
    }
    public void setNoTelepon(String noTelepon) {
        this.noTelepon = noTelepon;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat=alamat;
    }
    public String getInfo() {
    String info = "";
    info += "ID Pelanggan : " + idPelanggan + "\n";
    info += "Nama         : " + nama + "\n";
    info += "No Telepon   : " + noTelepon + "\n";
    info += "Alamat       : " + alamat + "\n";
    return info;
    }
}   
