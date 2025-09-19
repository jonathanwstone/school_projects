import java.util.*;
public class Driver {
    public static ArrayList<Item> items  = new ArrayList<Item>();

    public static void main(String[] args) {

        // Input tool
        Scanner input = new Scanner(System.in);

        // While loop to control menu
        while (true){

            // Menu
            System.out.println("1. Add Video Game");
            System.out.println("2. Add Development Kit");
            System.out.println("3. Add Tradeable");
            System.out.println("4. Add Collectable");
            System.out.println("5. List all items");
            System.out.println("6. Update price");
            System.out.println("7. Quit");

            // Option tools
            System.out.print("Enter option: ");
            int choice = input.nextInt();

            // Had input error so this clears the input queue
            input.nextLine();

            // Choice selector
            if (choice == 1){

                // Adds Video Game variables for constructor
                System.out.print("Enter the name of the item: ");
                String name = input.nextLine();
                System.out.print("Enter the price of the item: ");
                double price = input.nextDouble();
                System.out.print("Enter the name of the publisher: ");
                String publisher = input.nextLine();
                System.out.print("Does this game have multiplayer support? ");
                boolean multiplayer = input.nextBoolean();

                // Constructor creates new game
                VideoGame newGame = new VideoGame(name, price, publisher, multiplayer);

                // Adds newGame to ArrayList
                items.add(newGame);
                System.out.println("Item added.");
            }

            else if (choice == 2){

                // DevelopmentKit Variables
                System.out.print("Enter the name of the item: ");
                String name = input.nextLine();
                System.out.print("Enter the price of the item: ");
                double price = input.nextDouble();
                System.out.print("Enter the name of the publisher: ");
                String publisher = input.nextLine();
                System.out.println("Enter the name of each supported platform, one per line. Enter an empty line when done ");
                while (true){
                    String targetPlatform = input.nextLine();
                    if (targetPlatform.equals(" ")){
                        break;
                    }
                    else {
                        DeveloptmentKit.setTargetPlatforms(targetPlatform);
                    }

                }

                // Constructor DevelopmentKit
                DeveloptmentKit newKit = new DeveloptmentKit(name,price,publisher, DeveloptmentKit.targetPlatforms);

                // Adds and confirms new DevelopmentKit is added as an item
                items.add(newKit);
                System.out.println("Item added.");
            }

            else if (choice == 3){

                // Collects Tradeable Variables
                System.out.print("Enter the name of the item: ");
                String name = input.nextLine();
                System.out.print("Enter the price of the item: ");
                double price = input.nextDouble();
                System.out.print("Enter item's description: ");
                String description = input.nextLine();
                System.out.print("How many days before this item can be resold? ");
                int saleDelay = input.nextInt();

                // Constructor to create new Tradeable
                Tradeable newTradeable = new Tradeable(name, price, description, saleDelay);

                // Adds and confirms new Tradeable is added as an item
                items.add(newTradeable);
                System.out.println("Item added.");


            }

            else if (choice == 4){

                // Collects Variables of Collectables
                System.out.print("Enter the name of the item: ");
                String name = input.nextLine();
                System.out.print("Enter the price of the item: ");
                double price = input.nextDouble();
                System.out.print("Enter items description: ");
                String description = input.nextLine();
                System.out.print("Where can this collectable be used? ");
                String type = input.nextLine();

                // Constructor
                Collectable newCollectable = new Collectable(name, price, description, type);

                // Adds and confirms new Collectable is added as an item
                items.add(newCollectable);
                System.out.println("Item added.");

            }

            else if (choice == 5){
                if (items.size() == 0){
                    System.out.println("No items available.");
                    break;
                }
                else {
                    for (Item item : items){
                        System.out.println(item.toString());
                    }
                }
            }

            else if (choice == 6){
                System.out.print("Enter id of the item: ");
                int findId = input.nextInt();
                for (Item item : items){
                    if (item.getId() == findId){
                        System.out.print("Enter item's new price: ");
                        double newPrice = input.nextDouble();
                        if( newPrice > 0){
                            newPrice = 0;
                            item.setPrice(newPrice);
                            break;
                        }
                        else{
                            item.setPrice(newPrice);
                            System.out.println("Price updated");
                            break;
                        }

                    }
                }


            }

            else if (choice == 7){
                System.out.println("Shutting off...");
                break;
            }

            else{
                System.out.println("Invalid option");
            }
        }
    }
}