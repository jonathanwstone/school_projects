public class DigitalGood extends Item{

    // New Variable
    String description;

    // New Subclass Constructor
    DigitalGood(String name, double price, String description) {
        super(name, price);
        this.description = description;
    }

    // Getter
    public String getDescription() {
        return description;
    }

    // Setter
    public void setDescription(String description) {
        this.description = description;
    }

    // toString Override
    @Override
    public String toString() {
        return  "Item: " + name + "(#"+ id + ") | Price: $" + price + "\t Description: " + description;
    }
}
