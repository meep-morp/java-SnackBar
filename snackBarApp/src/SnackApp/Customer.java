package snackBarApp.src.SnackApp;

public class Customer {

    // Fields
    public static int maxId = 0;

    private int id;
    private String name;
    private float cash;

    // Getters
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