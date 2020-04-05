import java.sql.SQLOutput;

public class Drinks {
    public static void main(String[] args) {
        Mohito mohito1 = new Mohito();
        mohito1.title = "Mohito";
        mohito1.prize = 20;
        mohito1.alcohol = true;

        System.out.println("/---------------MOHITO---------------/");

        System.out.println("Drink: " +  mohito1.title);
        System.out.println("Cena: " + mohito1.prize + "zł");
        System.out.println("Posiada alkohol: " +  mohito1.alcohol);

        Products products1 = new Products();
        products1.product1 = "Syrop miętowy";
        products1.product2 = "Shot wódki";
        products1.product3 = "Shveepes";

        System.out.println("Produkt1: " + products1.product1);
        System.out.println("Produkt2: " + products1.product2);
        System.out.println("Produkt3: " + products1.product3);

        System.out.println("/----------SEX ON THE BEACH----------/");

        SOTB sotb1 = new SOTB();
        sotb1.title ="Sex on the beach";
        sotb1.prize = 22;
        sotb1.alcohol = true;

        System.out.println("Drink: " + sotb1.title);
        System.out.println("Cena: " + sotb1.prize + "zł");
        System.out.println("Posiada alkohol: " + sotb1.alcohol);

        Products products2 = new Products();
        products2.product1 = "Shot wódki";
        products2.product2 = "Shveepes brzoskwiniowy";
        products2.product3 = "Sok pomarańczowy";

        System.out.println("Produkt1: " + products2.product1);
        System.out.println("Produkt2: " + products2.product2);
        System.out.println("Produkt3: " + products2.product3);

        System.out.println("/---------------ICETEA---------------/");

        Icetea icetea1 = new Icetea();
        icetea1.title = "Icetea";
        icetea1.prize = 10;
        icetea1.alcohol = false;

        System.out.println("Drink: " + icetea1.title);
        System.out.println("Cena: " + icetea1.prize);
        System.out.println("Posiada alkohol: " + icetea1.alcohol);

        Products products3 = new Products();
        products3.product1 = "Brzoswkinia";
        products3.product2 = "Woda";
        products3.product3 = "Lód";

        System.out.println("Produkt1: " + products3.product1);
        System.out.println("Produkt2: " + products3.product2);
        System.out.println("Produkt3: " + products3.product3);

        







    }




}
