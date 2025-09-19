import java.util.*;
public class DeveloptmentKit extends Software {

    // New Variable
    public static ArrayList<String> targetPlatforms  = new ArrayList<String>();

    // New Constructor
    public DeveloptmentKit( String name, double price, String publisher, ArrayList<String> targetPlatforms) {
        super(name, price, publisher);
        targetPlatforms = targetPlatforms;
    }

    // Getter
    public ArrayList<String> getTargetPlatforms() {
        return targetPlatforms;
    }
    // Setter
    public static void setTargetPlatforms(String targetPlatform) {
        if (targetPlatforms == null){

            targetPlatforms = new ArrayList<String>();
            targetPlatforms.add("None");
        }
        else{
             targetPlatforms.add(targetPlatform);
        }
    }

    @Override
    public String toString() {
        return  "Item: " + name + "(#"+ id + ") | Price: $" + price + "\t Publisher: " + publisher+ "\t Target Platforms: " + targetPlatforms;
    }
}
