package snackBarApp.src.SnackApp;

import java.lang.reflect.Array;

public class Main {

    private static void workWithData() {
        // Init
        VendingMachine v1 = new VendingMachine("Food");
        VendingMachine v2 = new VendingMachine("Drink");
        VendingMachine v3 = new VendingMachine("Coffee");

        Customer jane = new Customer("Jane", 45.25F);
        Customer bob = new Customer("Bob", 33.14F);

        Snack chips = new Snack("Chips", 36, 1.75F, v1.getId());
        Snack chocolateBar = new Snack("Chocolate Bar", 36, 1F, v1.getId());
        Snack pretzels = new Snack("Pretzels", 30, 2F, v1.getId());

        Snack soda = new Snack("Soda", 24, 2.5F, v2.getId());
        Snack water = new Snack("Water", 20, 2.75F, v2.getId());

        // Processing
        System.out.println("Welcome to Snack Bar");

        System.out.println("Jane buys three sodas");
        System.out.println("Jane has " + jane.getCash());
        System.out.println("There are " + soda.getQuantity() + " sodas left.");

        System.out.println("Jane buys a bag of pretzels");
        System.out.println("Jane has " + jane.getCash());
        System.out.println("There are " + pretzels.getQuantity() + " pretzels left.");

        System.out.println("Bob buys two sodas");
        System.out.println("Bob has " + bob.getCash());
        System.out.println("There are " + soda.getQuantity() + " sodas left.");

        System.out.println("Jane finds $10");
        jane.addCash(10);
        System.out.println("Jane has " + jane.getCash());

        System.out.println("jane buys two chocolate bars");
        System.out.println("Jane has " + jane.getCash());
        System.out.println("There are " + chocolateBar.getQuantity() + " Chocolate bars left.");

        System.out.println("Pretzels restocked");
        System.out.println("There are " + pretzels.getQuantity() + " Pretzels left.");

        System.out.println("Bob buys three bags of pretzels");
        System.out.println("Bob has " + bob.getCash());
        System.out.println("There are " + pretzels.getQuantity() + " pretzels left.");
    }

    public static void main(String[] args) {
        workWithData();
    }
}