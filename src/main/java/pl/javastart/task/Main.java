package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink drinkFirst = new Drink();
        drinkFirst.name = "Mojito";
        drinkFirst.prize = 13.0;
        drinkFirst.containsAlco = true;
        drinkFirst.water.name = "woda";
        drinkFirst.water.capacity = 80;
        drinkFirst.citrjuice.name = "sok cytrynowy";
        drinkFirst.citrjuice.capacity = 30;
        drinkFirst.vodka.name = "wódka";
        drinkFirst.vodka.capacity = 100;
        drinkFirst.capacity = drinkFirst.water.capacity + drinkFirst.citrjuice.capacity + drinkFirst.vodka.capacity;
        System.out.println("Drink: " + drinkFirst.name);
        System.out.println("Cena: " + drinkFirst.prize + "zł");
        System.out.println("Czy zawiera alkohol? " + drinkFirst.containsAlco);
        System.out.println("Składniki:");
        System.out.println(drinkFirst.water.name);
        System.out.println(drinkFirst.citrjuice.name);
        System.out.println(drinkFirst.vodka.name);
        System.out.println("Pojemność: " + drinkFirst.capacity + "ml");

    }
}
