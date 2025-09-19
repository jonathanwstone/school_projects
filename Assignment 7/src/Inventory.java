import java.util.*;
public class Inventory {

    // Variables
    double balance;
    int itemsProcessed = 0;
    public Queue<Item> itemsList = new LinkedList<>();


    // Adds Item to last spot
    public void addItem(Item item) {
        itemsList.add(item);
    }

    // Increments and returns the head of the Queue
    public Item retrieveItem() {
        itemsProcessed++;
        return itemsList.peek();
    }

    // increments balance by amount paid
    public void incrementBalance(double paid) {
        balance += paid;
    }

    // getter for balance
    public double retrieveBalance() {
        return balance;
    }

    // getter for queue size
    public int getQueueSize() {
        return itemsList.size();
    }

    // getter for ItemsProcessed
    public int getItemsProcessed() {
        return itemsProcessed;
    }
}

