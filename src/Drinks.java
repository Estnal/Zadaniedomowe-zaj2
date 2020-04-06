import java.sql.SQLOutput;

public class Drinks {
    public static void main(String[] args) {
        Drink mohito1 = new Drink();
        mohito1.title = "Mohito";
        mohito1.prize = 20;
        mohito1.alcohol = true;

        mohito1.ingredient1.name = "Syrop miętowy";
        mohito1.ingredient1.quantity = 15;
        mohito1.ingredient2.name = "Shot wódki";
        mohito1.ingredient2.quantity = 20;
        mohito1.ingredient3.name = "Shveepes";
        mohito1.ingredient3.quantity = 40;



        System.out.println("/---------------MOHITO---------------/");

        System.out.println("Drink: " +  mohito1.title);
        System.out.println("Cena: " + mohito1.prize + "zł");
        System.out.println("Posiada alkohol: " +  mohito1.alcohol);


        System.out.println("Produkt 1: " + mohito1.ingredient1.name);
        System.out.println("Produkt 2: " + mohito1.ingredient2.name);
        System.out.println("Produkt 3: " + mohito1.ingredient3.name);

        System.out.println("Ilość pierwszego produnktu: " + mohito1.ingredient1.quantity + "ml");
        System.out.println("Ilość drugiego produktu: " + mohito1.ingredient2.quantity + "ml");
        System.out.println("Ilość treciego produktu: " + mohito1.ingredient3.quantity + "ml");

        int quantSum = mohito1.ingredient1.quantity + mohito1.ingredient2.quantity + mohito1.ingredient3.quantity;

        System.out.println("Suma produktów: " + quantSum + "ml");


        System.out.println("/----------SEX ON THE BEACH----------/");

        Drink sotb1 = new Drink();
        sotb1.title ="Sex on the beach";
        sotb1.prize = 22;
        sotb1.alcohol = true;

        System.out.println("Drink: " + sotb1.title);
        System.out.println("Cena: " + sotb1.prize + "zł");
        System.out.println("Posiada alkohol: " + sotb1.alcohol);

        sotb1.ingredient1.name = "Shot wódki";
        sotb1.ingredient1.quantity = 20;
        sotb1.ingredient2.name = "Shveepes brzoskwiniowy";
        sotb1.ingredient2.quantity = 30;
        sotb1.ingredient3.name = "Sok pomarańczowy";
        sotb1.ingredient3.quantity = 30;



        System.out.println("Produkt 1: " + sotb1.ingredient1.name);
        System.out.println("Produkt 2: " + sotb1.ingredient2.name);
        System.out.println("Produkt 3: " + sotb1.ingredient3.name);

        System.out.println("Ilość pierwszego produktu: " + sotb1.ingredient1.quantity + "ml");
        System.out.println("Ilość drugiego produktu: " + sotb1.ingredient2.quantity + "ml");
        System.out.println("Ilość trzeciego produktu: " + sotb1.ingredient3.quantity + "ml");

        int qanSum = sotb1.ingredient1.quantity + sotb1.ingredient2.quantity + sotb1.ingredient3.quantity ;

        System.out.println("Suma produktów: " + qanSum + "ml");


        System.out.println("/---------------ICETEA---------------/");

        Drink icetea1 = new Drink();
        icetea1.title = "Icetea";
        icetea1.prize = 10;
        icetea1.alcohol = false;

        System.out.println("Drink: " + icetea1.title);
        System.out.println("Cena: " + icetea1.prize);
        System.out.println("Posiada alkohol: " + icetea1.alcohol);

        icetea1.ingredient1.name = "Sok Brzoskwiniowy";
        icetea1.ingredient1.quantity = 25;
        icetea1.ingredient2.name = "Woda";
        icetea1.ingredient2.quantity = 30;
        icetea1.ingredient3.name = "Lód";
        icetea1.ingredient3.quantity = 5;


        System.out.println("Produkt 1: " + icetea1.ingredient1.name);
        System.out.println("Produkt 2: " + icetea1.ingredient2.name);
        System.out.println("Produkt 3: " + icetea1.ingredient3.name);


        int qnSum = icetea1.ingredient1.quantity + icetea1.ingredient2.quantity + icetea1.ingredient3.quantity;

        System.out.println("Ilość pierwszego produktu: " + icetea1.ingredient1.quantity + "ml");
        System.out.println("Ilośc drugiego produktu: " + icetea1.ingredient2.quantity + "ml");
        System.out.println("Ilość trzeciego produktu: " + icetea1.ingredient3.quantity + "ml");

        System.out.println("Suma produktów: " + qnSum + "ml");













    }




}
