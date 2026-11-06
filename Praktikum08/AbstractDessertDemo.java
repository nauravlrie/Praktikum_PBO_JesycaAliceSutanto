package Praktikum08;

public class AbstractDessertDemo {
    public static void main(String[] args) {
        
        RotiTawar roti1 = new RotiTawar("11 gram", "Wijen", "500 gram", "250 ml", "40 gram", "1 butir telur");
        roti1.cetakInfo();
        roti1.buat();
        

        System.out.println();

        Brownies brownies1 = new Brownies("200 gram", "50 gram", "150 gram", "50 ml", "100 gram", "2 butir");
        brownies1.cetakInfo();
        brownies1.buat();
    }
}
