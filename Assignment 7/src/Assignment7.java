import java.util.*;
import java.io.*;
public class Assignment7 {

    public static void main(String[] args) {
        // Tool
        Scanner input = new Scanner(System.in);

        //Variable
        Inventory inventory = new Inventory();

        // Reference table
        // Description // Price
        // T-Shirt     // $6.50
        // Sweater     // $8.50
        // Sweatpants  // $10.00
        // Skirt       // $25.50
        // Dress       // $15.50

        // Items
        Item newItem1 = new Item("T-Shirt", 6.50);
        Item newItem2 = new Item("Sweater", 8.50);
        Item newItem3 = new Item("Sweatpants", 10.00);
        Item newItem4 = new Item("Skirt", 25.50);
        Item newItem5 = new Item("Dress", 15.50);

        // Add to Queue
        inventory.addItem(newItem1);
        inventory.addItem(newItem2);
        inventory.addItem(newItem3);
        inventory.addItem(newItem4);
        inventory.addItem(newItem5);

        // Query operator on how many of x item to purchase, and record for itemsToProcess
        System.out.print("Purchase how many 't-shirt' at $6.50? ");
        int itemOneAmount = input.nextInt();
        System.out.print("Purchase how many 'sweater' at $8.50? ");
        int itemTwoAmount = input.nextInt();
        System.out.print("Purchase how many 'sweatpants' at $10.00? ");
        int itemThreeAmount = input.nextInt();
        System.out.print("Purchase how many 'skirt' at $25.50? ");
        int itemFourAmount = input.nextInt();
        System.out.print("Purchase how many 'dress' at $15.50? ");
        int itemFiveAmount = input.nextInt();

        // Create purchasers
        Purchaser purchaserOne = new Purchaser(inventory, newItem1, itemOneAmount);
        Purchaser purchaserTwo = new Purchaser(inventory, newItem2, itemTwoAmount);
        Purchaser purchaserThree = new Purchaser(inventory, newItem3, itemThreeAmount);
        Purchaser purchaserFour = new Purchaser(inventory, newItem4, itemFourAmount);
        Purchaser purchaserFive = new Purchaser(inventory, newItem5, itemFiveAmount);

        // Confirmation and begins purchasing on command
        System.out.print("Purchasers created. Press 'enter' to start purchases...");
        input.nextLine();

        // Thread ripper
        purchaserOne.start();
        purchaserTwo.start();
        purchaserThree.start();
        purchaserFour.start();
        purchaserFive.start();

        // Confirmation
        System.out.print("Purchasers are done working. A total of "+ Purchaser.getItemsProcessed() + " items are awaiting processing.");


        System.out.println("Create how many processors? ");
        int numProcessors=input.nextInt();
        for (int i=0;i<numProcessors;i++){
            Processor temp = new Processor(inventory);
            temp.start();
        }
        System.out.println("Purchasers are done working..");
    }
}


