package Praktikum10;

public class MainTugas {
    public static void main(String[] args) {
        
        Surat surat1 = new Surat("Violet Evergarden", "Jl. Mwar No.12, Leiden", "Terima kasih atas semua kebaikanmu.");
        System.out.println("=== PENGIRIMAN SURAT ===");
        System.out.println(surat1.getInfo());
        surat1.kirim();
        surat1.cekStatusPengiriman();

        System.out.println();

        Email email1 = new Email ("jesyca@gmail.com", "dosen@polinema.ac.id", "Review Laut Bercerita", "Berikut adalah file review an yang saya buat");
        System.out.println("=== PENGIRIMAN EMAIL ===");
        System.out.println(email1.getInfo());
        email1.kirim();
        email1.cekStatusPengiriman();
    }
}
