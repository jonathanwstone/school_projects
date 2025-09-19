public class Purchaser extends Thread {

    // Variable
    static int nextId = 0;
    int id;
    int itemsProcessed;
    int itemsToProcess;
    Inventory queue;
    Item item;

    // Constructor for Purchaser
    public Purchaser(Inventory queue, Item item, int itemsToProcess){
        this.queue = queue;
        this.item = item;
        this.itemsToProcess = itemsToProcess;
        this.id = nextId++;
        this.itemsProcessed = itemsProcessed;
    }



    // runs the class and created items
    @Override
    public void run(){
        System.out.println("Purchaser "+ this.id + "starting purchases...");

        // Makes sure we do not have constantly added items
        itemsProcessed = 0;

        // Processes our items until we don't have any left
        while (itemsToProcess != 0){
            queue.addItem(item);
            itemsToProcess -= 1;
            itemsProcessed +=1;
        }
        System.out.println(" Purchaser " + this.id+ " purchased " + this.itemsProcessed + " " + this.item );

    }
}
