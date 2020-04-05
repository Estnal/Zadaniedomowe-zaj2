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

        Quantity quantity1 = new Quantity();
        quantity1.prod1 = 15;
        quantity1.prod2 = 20;
        quantity1.prod3 = 40;

        System.out.println("Produkt 1: " + products1.product1);
        System.out.println("Produkt 2: " + products1.product2);
        System.out.println("Produkt 3: " + products1.product3);

        System.out.println("Ilość pierwszego produnktu: " + quantity1.prod1 + "ml");
        System.out.println("Ilość drugiego produktu: " + quantity1.prod2 + "ml");
        System.out.println("Ilość treciego produktu: " + quantity1.prod3 + "ml");

        int quantSum = quantity1.prod1 + quantity1.prod2 + quantity1.prod3;

        System.out.println("Suma produktów: " + quantSum + "ml");


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

        Quantity quantity2 = new Quantity();
        quantity2.prod1 = 20;
        quantity2.prod2 = 30;
        quantity2.prod3 = 30;

        System.out.println("Produkt 1: " + products2.product1);
        System.out.println("Produkt 2: " + products2.product2);
        System.out.println("Produkt 3: " + products2.product3);

        System.out.println("Ilość pierwszego produktu: " + quantity2.prod1 + "ml");
        System.out.println("Ilość drugiego produktu: " + quantity2.prod2 + "ml");
        System.out.println("Ilość trzeciego produktu: " + quantity2.prod3 + "ml");

        int qanSum = quantity2.prod1 + quantity2.prod2 + quantity2.prod3;

        System.out.println("Suma produktów: " + qanSum + "ml");


        System.out.println("/---------------ICETEA---------------/");

        Icetea icetea1 = new Icetea();
        icetea1.title = "Icetea";
        icetea1.prize = 10;
        icetea1.alcohol = false;

        System.out.println("Drink: " + icetea1.title);
        System.out.println("Cena: " + icetea1.prize);
        System.out.println("Posiada alkohol: " + icetea1.alcohol);

        Products products3 = new Products();
        products3.product1 = "Sok Brzoswkinia";
        products3.product2 = "Woda";
        products3.product3 = "Lód";

        System.out.println("Produkt 1: " + products3.product1);
        System.out.println("Produkt 2: " + products3.product2);
        System.out.println("Produkt 3: " + products3.product3);

        Quantity quantity3 = new Quantity();
        quantity3.prod1 = 25;
        quantity3.prod2 = 30;
        quantity3.prod3 = 5;

        int qnSum = quantity3.prod1 + quantity3.prod2 + quantity3.prod3;

        System.out.println("Ilość pierwszego produktu: " + quantity3.prod1 + "ml");
        System.out.println("Ilośc drugiego produktu: " + quantity3.prod2 + "ml");
        System.out.println("Ilość trzeciego produktu: " + quantity3.prod3 + "ml");

        System.out.println("Suma produktów: " + qnSum + "ml");













    }




}
