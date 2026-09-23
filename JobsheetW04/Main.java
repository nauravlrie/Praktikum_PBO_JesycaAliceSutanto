package JobsheetW04;

public class Main {
    public static void main(String[] args) {
        Bunga b1 = new Bunga("B01", "Mawar Merah", 15000);
        Bunga b2 = new Bunga("B02", "Lily", 25000);
        Bunga b3 = new Bunga("B03", "Tulip", 30000);

        Pelanggan p1 = new Pelanggan("CUST-001", "Alice", "080808080", "Jl. Trisula No.3");
        Pesanan pesanan1 = new Pesanan("ORDER-2026-001", "23-09-2026",p1);
        pesanan1.tambahDetail(b1, 5);
        pesanan1.tambahDetail(b2, 3);
        pesanan1.tambahDetail(b3,2);

        pesanan1.cetakStruk();
    }
}
