package Praktikum10;

public class Email implements Sendable{
    private String emailPengirim;
    private String emailPenerima;
    private String subjek;
    private String isiEmail;

    public Email(String emailPengirim, String emailPenerima, String subjek, String isiEmail) {
        this.emailPengirim = emailPengirim;
        this.emailPenerima = emailPenerima;
        this.subjek = subjek;
        this.isiEmail = isiEmail;
    }

    @Override 
    public void kirim() {
        System.out.println("Mengirim email dengan subjek'" + this.subjek + "' dari " + this.emailPengirim + " ke server internet.");
    }

    @Override
    public void cekStatusPengiriman() {
        System.out.println("Status: Email berhasil masuk ke folder Inbox" + this.emailPenerima);
    }
    public String getInfo() {
        return "Email Pengirim : " + this.emailPengirim + "\n" +
               "Email Penerima : " + this.emailPenerima + "\n" +
               "Subjek         : " + this.subjek + "\n" +
               "Isi Email      : " + this.isiEmail;
    }
}
