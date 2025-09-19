public class Processor extends Thread {
    static int nextId = 1;
    int id;
    Inventory queue;
    int numberOfOrders;
    double revenue;

    public Processor(Inventory queue){
        this.queue = queue;
        this.id = nextId++;
        this.numberOfOrders = 0;
        this.revenue = 0;

    }
    @Override
    public void run(){
        while (true){
            Item item = this.queue.retrieveItem();
            if (item == null){
                break;
            }
            this.queue.incrementBalance(item.cost);
            this.numberOfOrders++;
            this.revenue += item.cost;
        }
        System.out.println("Processor " + this.id + " processed " + this.numberOfOrders + " orders totaling $" + revenue);

    }
}
