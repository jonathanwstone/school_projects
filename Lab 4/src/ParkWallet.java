// Class: CSE 1322L
// Term: Fall 2024
// Instructor: John Blake
// Lab# : Lab 4

import java.util.*;
public class ParkWallet {

    static Scanner input = new Scanner(System.in);

    // Variables
    private int tickets;
    private static boolean holiday = false;
    private  static boolean Driver = true;

    // Constructor
    public ParkWallet(){
        this.tickets = 0;
    }
    // Other Constructor
    public ParkWallet(int tickets){
        if (tickets >= 0){
            this.tickets = tickets;
        }
        else{
            this.tickets = 0;
        }
    }

    // Getter - tickets
    public int getTickets(){
        return tickets;
    }
    // Setter - tickets
    public void setTickets(int tickets){
        if (tickets >= 0){
            this.tickets = tickets;
        }
        else{
            this.tickets = 0;
        }
    }

    // Getter - holiday
    public boolean isHoliday(){
        return holiday;
    }

    // Setter - holiday, should swap the boolean value
    public static void setHoliday(){
        if (!holiday){
            holiday = true;
        }
        else{
            holiday = false;
        }

    }

    private void addTickets(int tickets){
        if (tickets >= 0){
            this.tickets += tickets;
        }
    }

    private boolean removeTickets(int tickets){
        if (tickets>= 0 && tickets <= this.tickets){
            this.tickets -= tickets;
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {

        // Starting Wallet
        ParkWallet wallet1 = new ParkWallet(100);

        // User Menu
        while (Driver){
            if (holiday){
                System.out.println("1. Add Tickets");
                System.out.println("2. Set Tickets");
                System.out.println("3. Buy prize at holiday prices!");
                System.out.println("4. Set Holiday");
                System.out.println("5. Quit");
                System.out.println("Your wallet has "+ wallet1.getTickets() + " tickets");
                System.out.print("Enter your choice: ");
            }
            else if (!holiday){
                System.out.println("1. Add Tickets");
                System.out.println("2. Set Tickets");
                System.out.println("3. Buy prize");
                System.out.println("4. Set Holiday");
                System.out.println("5. Quit");
                System.out.println("Your wallet has "+ wallet1.getTickets() + " tickets");
                System.out.print("Enter your choice: ");
            }
            int userChoice = input.nextInt();

            // Adds tickets to wallet
            if (userChoice == 1){
                // Queries user for ticket amount
                System.out.println(" ");
                System.out.print("Add how many tickets? ");

                // Adds tickets
                wallet1.addTickets(input.nextInt());
                System.out.println(" ");

            }

            // Sets ticket value manually
            else if (userChoice == 2){
                // Queries user for new ticket value
                System.out.println(" ");
                System.out.print("Set ticket balance to: ");

                // Manually sets the ticket value
                wallet1.setTickets(input.nextInt());
                System.out.println(" ");

            }

            // Option to exchange tickets for prizes
            else if (userChoice == 3){
                System.out.println(" ");



                if (holiday){
                    System.out.println("Holiday Prices!");
                    System.out.println("1. T-Shirt (75 tickets)");
                    System.out.println("2. Sun hat (175 tickets)");
                    System.out.println("3. Sneakers (300 tickets)");
                    System.out.print("Buy which prize? ");
                    int prizeChoice = input.nextInt();
                    if (prizeChoice == 1){
                        String prize = "T-Shirt";
                        boolean result = wallet1.removeTickets(75);

                        if (result){
                            System.out.println("Bought a " + prize + " for 75 tickets");

                        }
                        else{
                            System.out.println("Not enough tickets to buy a " + prize);
                        }

                    }
                    else if (prizeChoice == 2){
                        String prize = "Sun hat";
                        boolean result = wallet1.removeTickets(175);

                        if (result){
                            System.out.println("Bought a " + prize + " for 175 tickets");

                        }
                        else{
                            System.out.println("Not enough tickets to buy a " + prize);
                        }

                    }
                    else if (prizeChoice == 3){
                        String prize = "Sneakers";
                        boolean result = wallet1.removeTickets(300);

                        if (result){
                            System.out.println("Bought a " + prize + " for 300 tickets");

                        }
                        else{
                            System.out.println("Not enough tickets to buy a " + prize);
                        }

                    }
                    System.out.println(" ");

                }
                else if (!holiday){
                    System.out.println("1. T-Shirt (150 tickets)");
                    System.out.println("2. Sun hat (350 tickets)");
                    System.out.println("3. Sneakers (600 tickets)");
                    System.out.print("Buy which prize? ");
                    int prizeChoice = input.nextInt();
                    if (prizeChoice == 1){
                        String prize = "T-Shirt";
                        boolean result = wallet1.removeTickets(150);

                        if (result){
                            System.out.println("Bought a " + prize + " for 150 tickets");

                        }
                        else{
                            System.out.println("Not enough tickets to buy a " + prize);
                        }

                    }
                    else if (prizeChoice == 2){
                        String prize = "Sun hat";
                        boolean result = wallet1.removeTickets(350);

                        if (result){
                            System.out.println("Bought a " + prize + " for 350 tickets");

                        }
                        else{
                            System.out.println("Not enough tickets to buy a " + prize);
                        }

                    }
                    else if (prizeChoice == 3){
                        String prize = "Sneakers";
                        boolean result = wallet1.removeTickets(600);

                        if (result){
                            System.out.println("Bought a " + prize + " for 600 tickets");

                        }
                        else{
                            System.out.println("Not enough tickets to buy a " + prize);
                        }

                    }
                    System.out.println(" ");
                }



            }

            // allows user to Switch Holiday value between true and false
            else if (userChoice == 4){
                System.out.println(" ");
                setHoliday();
                if (holiday){
                    System.out.println("It is now a holiday");
                }
                if (!holiday){
                    System.out.println("It is no longer a holiday.");
                }
                System.out.println(" ");

            }

            // Quit
            else if (userChoice == 5){
                System.out.println(" ");
                System.out.println("Shutting off...");
                Driver = false;
            }

            // Error Handler
            else{
                System.out.println("Invalid choice, please select from the available options.");
                System.out.print(" ");
            }


        }



    }
}
