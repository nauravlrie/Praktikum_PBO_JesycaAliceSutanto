package Jobsheet07;

public class Dosen extends Pegawai{
    public String nidn;
    
    public Dosen() {
        // super();
        System.out.println("Ini constructor class Dosen");
    }
    public String getAllInfo() {
        String info = "";
        info += "NIP: " + nip + "\n";
        info += "Nama: " + nama + "\n";
        info += "Gaji: " + gaji + "\n";
        info += "NIDN: " + nidn + "\n";

        return info;
    }
}
