// Name: Jonathan Stone
// Class: CS 3305/Section 03
// Term: Fall 2025
// Instructor: Dr. Haddad
// Assignment: 3
// IDE Name: IntelliJ

import java.util.Scanner;

public class myTest_No_HT
{

    public static void main (String[] args)
    {
        // Boolean to allow menu to run
        boolean running = true;

        // input tool
        Scanner input = new Scanner(System.in);

        LinkedList_No_HT myList = new LinkedList_No_HT(); //create a list object



        // Menu
        while (running){
            System.out.println("---------MAIN MENU--------");
            System.out.println("1 – Add First Node");
            System.out.println("2 – Add Last Node");
            System.out.println("3 – Add At Index");
            System.out.println("4 – Remove First Node");
            System.out.println("5 – Remove Last Node");
            System.out.println("6 – Remove At Index");
            System.out.println("7 – Print List Size");
            System.out.println("8 – Print List Forward");
            System.out.println("9 – Print List In Reverse");
            System.out.println("10- Exit program");

            // Spacer
            System.out.println(" ");

            // Asks User for input
            System.out.print("Enter option number: ");
            int option = input.nextInt();

            if (option == 1){

                // Ask user what they want to add and store data
                System.out.print("Enter the value you'd like to add: ");
                int add = input.nextInt();

                //Print List first
                System.out.print("List content before adding " + add + " is: ");
                myList.printList();
                System.out.println(" ");
                // Add to first spot
                myList.addFirstNode(add);
                // Print list after adding
                System.out.print("List content after adding " + add + " is: ");
                myList.printList();
                System.out.println(" ");

                // Spacing
                System.out.println(" ");
            }
            else if (option == 2){

                // Ask user what they want to add and store data
                System.out.print("Enter the value you'd like to add: ");
                int add = input.nextInt();

                //Print List first
                System.out.println("List content before adding " + add + " is: ");
                myList.printList();
                System.out.println(" ");
                // Add to last spot
                myList.addLastNode(add);
                // Print list after adding
                System.out.println("List content after adding " + add + " is: ");
                myList.printList();
                System.out.println(" ");

                // Spacing
                System.out.println(" ");
            }
            else if (option == 3){

                // Ask user what they want to add and store data
                System.out.print("Enter the value you'd like to add: ");
                int add = input.nextInt();
                System.out.print("Enter the index value you'd like to add to: ");
                int index = input.nextInt();

                // Check index value
                if (index < 0 || index > myList.countNodes()) {
                    System.out.println("Invalid index, try again");
                } else {
                    //Print List first
                    System.out.println("List content before adding " + add + " is: ");
                    myList.printList();
                    System.out.println(" ");
                    // Add to indexed spot
                    myList.addAtIndex(index, add);
                    // Print list after adding
                    System.out.println("List content after adding " + add + " is: ");
                    myList.printList();
                    System.out.println(" ");
                }





                // Spacing
                System.out.println(" ");
            }

            else if (option == 4){

                if (myList.countNodes() == 0) {
                    System.out.println("List is Empty");
                } else {
                    // Alerts user to what is done
                    System.out.println("Method removeFirstNode");
                    //Print List first
                    System.out.println("List content before removing first node is: ");
                    myList.printList();
                    System.out.println(" ");
                    // Remove node
                    myList.removeFirstNode();
                    // Print list after adding
                    System.out.println("List content after removing first node is: ");
                    myList.printList();
                    System.out.println(" ");
                }

            }
            else if (option == 5){

                if (myList.countNodes() == 0) {
                    System.out.println("List is Empty");
                } else {
                    // Alerts user to what is done
                    System.out.println("Method removeLastNode");
                    //Print List first
                    System.out.println("List content before removing last node is: ");
                    myList.printList();
                    System.out.println(" ");
                    // Remove node
                    myList.removeLastNode();
                    // Print list after adding
                    System.out.println("List content after removing last node is: ");
                    myList.printList();
                    System.out.println(" ");
                }

            }

            else if (option == 6){

                if (myList.countNodes() == 0) {
                    System.out.println("List is Empty");
                } else {
                    // Get index value
                    System.out.print("Enter index value that you would like removed: ");
                    int index = input.nextInt();

                    // Check index
                    if (index < 0 || index >= myList.countNodes()) {
                        System.out.println("Invalid index, try again");
                    } else {

                        // Alerts user to what is done
                        System.out.println("Method removeAtIndex");
                        //Print List first
                        System.out.println("List content before removing indexed node is: ");
                        myList.printList();
                        System.out.println(" ");
                        // Remove node
                        myList.removeAtIndex(index);
                        // Print list after adding
                        System.out.println("List content after removing indexed node is: ");
                        myList.printList();
                        System.out.println(" ");

                    }

                }


            }

            else if (option == 7){

                System.out.println("The list size is " + myList.countNodes() + " Nodes");

                // Spacing
                System.out.println(" ");

            }

            else if (option == 8){

                System.out.print("The list is: ");
                myList.printList();

                // Spacing
                System.out.println(" ");

            }

            else if (option == 9){
                System.out.print("The list in reverse is: ");
                myList.printInReverse();

                // Spacing
                System.out.println(" ");

            }

            else if (option == 10){

                // Ends Menu/While loop
                running = false;

            }

            // Handles errors in user option
            else{
                System.out.println("Incorrect option typed, please try again.");
                System.out.println(" ");
            }

        }


    }
}