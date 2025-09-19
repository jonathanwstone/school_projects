public class VideoGame extends Software{
    boolean multiplayerSupport;

    VideoGame(String name, double price, String publisher, boolean multiplayerSupport) {
        super(name, price, publisher);
        this.multiplayerSupport = multiplayerSupport;
    }

    // Getter
    public boolean getMultiplayerSupport() {
        return multiplayerSupport;
    }

    // Setter
    public void setMultiplayerSupport(boolean multiplayerSupport) {
        this.multiplayerSupport = multiplayerSupport;
    }

    // toSting Override
    @Override
    public String toString() {
        return "Item: " + name + "(#"+ id + ") | Price: $" + price + "\t Publisher: " + publisher + "\t MultiplayerSupport: " + multiplayerSupport;
    }
}