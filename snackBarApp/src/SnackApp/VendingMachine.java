package snackBarApp.src.SnackApp;

public class VendingMachine {
    // Fields
    public static int maxId = 0;

    private int id;
    private String name;

    // Constructor

    public VendingMachine(String name) {
        maxId++;
        this.id = maxId;

        this.name = name;
    }

    // Getters

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Setters

    public void setName(String name) {
        this.name = name;
    }
}