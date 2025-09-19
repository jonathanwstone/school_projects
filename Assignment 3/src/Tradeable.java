public class Tradeable extends DigitalGood {

    // New Variable
    int saleDelay;

    // New Constructor
    public Tradeable(String name, double price, String description, int saleDelay) {
        super(name, price, description);
        this.saleDelay = saleDelay;
    }

    // Getter
    public int getSaleDelay(){
        return saleDelay;
    }

    // Setter
    public void setSaleDelay(int saleDelay){
        if (saleDelay > 0){
            this.saleDelay = saleDelay;
        }
        else{
            System.out.println("Sale delay should be a positive number, value kept the same");
        }
    }

    // toString Override
    public String toString(){
        return  "Item: " + name + "(#"+ id + ") | Price: $" + price + "\t Description: " + description +
                "\t Item can only be owned for " + saleDelay + " days";
    }
}