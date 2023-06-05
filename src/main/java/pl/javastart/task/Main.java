package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Drink drinkFirst = new Drink();

        drinkFirst.name = "Mojito";
        drinkFirst.prize = 13.00;
        drinkFirst.containsAlco = true;
        drinkFirst.ingredientFirst.name = "woda";
        drinkFirst.ingredientFirst.capacity = 80;
        drinkFirst.ingredientSec.name = "sok cytrynowy";
        drinkFirst.ingredientSec.capacity = 30;
        drinkFirst.ingredientThrd.name = "wódka";
        drinkFirst.ingredientThrd.capacity = 100;
        int capacity = drinkFirst.ingredientFirst.capacity + drinkFirst.ingredientSec.capacity + drinkFirst.ingredientThrd.capacity;
        System.out.println("Drink: " + drinkFirst.name);
        System.out.println("Cena: " + drinkFirst.prize + "zł");
        System.out.println("Czy zawiera alkohol? " + drinkFirst.containsAlco);
        System.out.println("Składniki:");
        System.out.println(drinkFirst.ingredientFirst.name);
        System.out.println(drinkFirst.ingredientSec.name);
        System.out.println(drinkFirst.ingredientThrd.name);
        System.out.println("Pojemność: " + capacity + "ml");

    }
}
