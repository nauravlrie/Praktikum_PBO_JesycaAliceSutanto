package Jobsheet07;

public class DessertDemo {
    public static void main(String[] args) {

        System.out.println("=== Roti Tawar ===");

        RotiTawar roti1 = new RotiTawar("500g", "250ml","40g", "1 butir", "11g", "Wijen");
        System.out.println(roti1.getInfo());

        System.out.println("=== Brownies ===");

        Brownies brownies1 = new Brownies("150g", "50ml", "100g", "2 butir", "200g", "50g", "50ml", "1sdt");
        System.out.println(brownies1.getInfo());

        Brownies brownies2 = new Brownies();
        System.out.println(brownies2.getInfo());
    }
}
