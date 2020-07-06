package snackBarApp.src.SnackApp;

public class Snack {

    // Fields
    private static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private float cost;
    private int vendingMachineId;

    // Constructor

    public Snack(String name, int quantity, float cost, int vendingMachineId) {
        maxId++;
        id = maxId;
        this.name = name;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setVendingMachineId(int vendingMachineId) {
        this.vendingMachineId = vendingMachineId;
    }

    // Getters

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getCost() {
        return cost;
    }

    public int getVendingMachineId() {
        return vendingMachineId;
    }
}