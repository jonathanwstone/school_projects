public class Collectable extends DigitalGood {

    // New Variable
    String type;

    // New Constructor
    public Collectable(String name, double price, String description, String type) {
        super(name, price, description);
        this.type = type;
    }

    // Getter
    public String getType(){
     return type;
    }

    // Setter
    public void setType(String type){
        if (type.equals("emoticon") | type.equals("avatar")| type.equals("background")| type.equals("nothing")){
            this.type = type;
        }
        else{
            this.type = "nothing";
        }
    }

    // toString Override
    public String toString(){
        return  "Item: " + name + "(#"+ id + ") | Price: $" + price + "\t Description: " + description +
                "\t Can be used as" + type;
    }
}
