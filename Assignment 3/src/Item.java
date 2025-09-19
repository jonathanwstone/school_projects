import java.util.*;

public class Item {
    // Variables

    int id;
    static int nextId = 0;
    double price;
    String name;

    // Tools
    Scanner input = new Scanner(System.in);

    Item(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = nextId++;
    }

    // Getters

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return id;
    }

    // Setters

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("Price cannot be negative");
            boolean reset = true;
        }
        if (price >= 0) {
            this.price = price;
            boolean reset = false;
        }
    }
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Item: " + name + "(# "+ id + ") | Price: $" + price;
    }

}
