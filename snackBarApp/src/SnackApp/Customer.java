package snackBarApp.src.SnackApp;

public class Customer {

    // Fields
    public static int maxId = 0;

    private int id;
    private String name;
    private float cash;

    //Constructor
    public Customer(String name, float cash) {
        maxId++;
        id = maxId;

        this.name = name;
        this.cash = cash;
    }

    // Methods 
    public void addCash(float amount) {
        this.cash += amount;
    }

    public void buySnacks(Object snackName, int snackAmount, float price) {
        this.cash -= price;

        // snackName.buySnack(snackAmount);
    }

    // Getters
    public float getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getCash() {
        return cash;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setCash(float cash) {
        this.cash = cash;
    }
}