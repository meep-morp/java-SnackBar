package snackBarApp.src.SnackApp;

public class VendingMachine {
    // Fields
    public static int maxId = 0;

    private int id;
    private String name;

    // Constructor

    public VendingMachine(String name) {
        maxId++;
        id = maxId;

        this.name = name;
    }

    // Getters

    public String getName() {
        return name;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }
}