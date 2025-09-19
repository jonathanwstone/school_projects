import java.util.Scanner;

    public static void main(String[] args) {

        // Define Variables
        int apple_stock = 0;
        int orange_stock = 0;
        double apple_price = 0.00;
        double orange_price = 0.00;
        double current_cash = 0.00;

        // Tools
        Scanner input = new Scanner(System.in);
        boolean management_tool = true;

        // Create menus

        while (management_tool) {
            System.out.println("[Fruit Management System]");
            System.out.println("1 . Buy Apples");
            System.out.println("2. Buy Oranges");
            System.out.println("3. Sell Apples");
            System.out.println("4. Sell Oranges");
            System.out.println("5. Change Price of Apples");
            System.out.println("6. Change Price of Oranges");
            System.out.println("7. List Inventory");
            System.out.println("8. Show Balance");
            System.out.println("0. Exit");
            System.out.print("Enter option: ");
            int user_pick = input.nextInt();

            // Option 1
            if (user_pick == 1) {

                // Apple Quantity
                System.out.print("Buy how many apples? ");
                int purchased_apples = input.nextInt();

                // Handle exceptions
                if (purchased_apples < 0) {
                    System.out.print("Invalid quantity. Enter a non-negative number: ");
                    purchased_apples = input.nextInt();
                }

                // Apple Price and payment for goods
                System.out.print("Buy apples at what price? ");
                double apple_market_price = input.nextDouble();
                double apple_total_price = apple_market_price * purchased_apples;
                current_cash -= apple_total_price;

                // Wrap up of what happened within if statement
                System.out.println("Bought " + purchased_apples + " apples @ $" + apple_market_price + " for a total of $"
                        + apple_total_price);
                apple_stock += purchased_apples;
                System.out.println(" ");


            }

            // Option 2
            else if (user_pick == 2) {
                // Orange Quantity
                System.out.print("Buy how many oranges? ");
                int purchased_oranges = input.nextInt();

                // Handle exceptions
                if (purchased_oranges < 0) {
                    System.out.print("Invalid quantity. Enter a non-negative number: ");
                    purchased_oranges = input.nextInt();
                }

                // Orange Price and payment for goods
                System.out.print("Buy oranges at what price? ");
                double orange_market_price = input.nextDouble();
                double oranges_total_price = orange_market_price * purchased_oranges;
                current_cash -= oranges_total_price;

                // Wrap up of what happened within if statement
                System.out.println("Bought " + purchased_oranges + " oranges @ $" + orange_market_price + " for a total of $"
                        + oranges_total_price);
                orange_stock += purchased_oranges;
                System.out.println(" ");


            }
            // Option 3
            else if (user_pick == 3) {
                System.out.print("Sell how many apples @ $" + apple_price + "? ");
                int sold_apples = input.nextInt();

                // Exception handler for selling negative number of apples
                if (sold_apples < 0) {
                    System.out.print("Invalid quantity. Enter a non-negative number of apples to sell: ");
                }

                // Exception handler for selling more apples than in stock
                else if (sold_apples > apple_stock) {
                    double total_apple_profit = apple_stock * apple_price;
                    current_cash += total_apple_profit;
                    System.out.println("Not enough apples. Selling instead " + apple_stock + " apples @ $" +
                            apple_price + " for a total of $" + total_apple_profit);
                    apple_stock = 0;
                } else if (sold_apples == apple_stock) {
                    double total_apple_profit = sold_apples * apple_price;
                    System.out.println("Sold all apples @ $" + apple_price + " for a total of $" + total_apple_profit);
                    apple_stock = 0;
                } else {
                    double total_apple_profit = sold_apples * apple_price;
                    System.out.print("Sold " + sold_apples + " apples @ $" + apple_price + "for a total of $" +
                            total_apple_profit);
                    apple_stock -= sold_apples;
                }
                System.out.println(" ");

            }
            // Option 4
            else if (user_pick == 4) {
                System.out.print("Sell how many oranges @ $" + orange_price + "? ");
                int sold_oranges = input.nextInt();

                // Exception handler for selling negative number of oranges
                if (sold_oranges < 0) {
                    System.out.print("Invalid quantity. Enter a non-negative number of oranges to sell: ");
                }

                // Exception handler for selling more oranges than in stock
                else if (sold_oranges > orange_stock) {
                    double total_orange_profit = orange_stock * orange_price;
                    current_cash += total_orange_profit;
                    System.out.println("Not enough oranges. Selling instead " + orange_stock + " oranges @ $" +
                            orange_price + " for a total of $" + total_orange_profit);
                    orange_stock = 0;
                } else if (sold_oranges == orange_stock) {
                    double total_orange_profit = sold_oranges * orange_price;
                    System.out.println("Sold all oranges @ $" + orange_price + " for a total of $" + total_orange_profit);
                    orange_stock = 0;
                } else {
                    double total_orange_profit = sold_oranges * orange_price;
                    System.out.print("Sold " + sold_oranges + " oranges @ $" + orange_price + "for a total of $" +
                            total_orange_profit);
                    orange_stock -= sold_oranges;
                }
                System.out.println(" ");

            }
            // Option 5
            else if (user_pick == 5) {
                System.out.print("What should be the new price of selling apples? $");
                double new_apple_price = input.nextDouble();

                if (new_apple_price < 0) {
                    System.out.print("Invalid price. Please enter non-negative price: $");
                    new_apple_price = input.nextDouble();
                }
                if (new_apple_price >= 0) {
                    apple_price = new_apple_price;
                    System.out.println("Selling price of apples  set @ $" + apple_price);
                }
                System.out.println(" ");

            }
            // Option 6
            else if (user_pick == 6) {
                System.out.print("What should be the new price of selling oranges? $");
                double new_orange_price = input.nextDouble();

                if (new_orange_price < 0) {
                    System.out.print("Invalid price. Please enter non-negative price: $");
                    new_orange_price = input.nextDouble();
                }
                if (new_orange_price >= 0) {
                    orange_price = new_orange_price;
                    System.out.println("Selling price of apples  set @ $" + orange_price);

                    }
                System.out.println(" ");
            }
            // Option 7
            else if (user_pick == 7) {
                System.out.println("Current inventory is:");
                System.out.println( apple_stock + "apples selling @ $" + apple_price) ;
                System.out.println( orange_stock + "oranges selling @ $" + orange_price) ;
                System.out.println(" ");
            }
            // Option 8
            else if (user_pick == 8) {
                System.out.println("Current balance is $" +current_cash);
                System.out.println(" ");

            }
            // Option 0, Option to end program
            else if (user_pick == 0) {
                System.out.println("Shutting off...");
                management_tool = false;
            }
            // Invalid option clause
            else {
                System.out.println("Invalid option");

                }
            }
        }
    }