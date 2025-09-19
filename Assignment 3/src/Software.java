public class Software extends Item {

    // New Variable

    String publisher;

    // New Subclass Constructor

    Software(String name, double price, String publisher) {
        super(name, price);
        this.publisher = publisher;
    }

    // Setter

    public void setPublisher(String publisher){
        if (publisher == null){
            this.publisher = "Unknown";

        }
        else {
            this.publisher = publisher;

        }
    }

    // toString Override
    @Override
    public String toString(){
        return  "Item: " + name + "(#"+ id + ") | Price: $" + price + "\t Publisher: " + publisher;
    }

}
