import java.util.*;

public class Driver {


    public static void main(String[] args) {

        // Tools
        Scanner input = new Scanner(System.in);

        // Using Constructors to build accounts
        Checking newChecking = new Checking( 0);
        Savings newSavings = new Savings(500);

        // Loop and menu incorporation

        while(true){
            System.out.println("1. Withdraw from Checking");
            System.out.println("2. Withdraw from Savings");
            System.out.println("3. Deposit to Checking");
            System.out.println("4. Deposit to Savings");
            System.out.println("5. Balance of Checking");
            System.out.println("6. Balance of Savings");
            System.out.println("7. Award Interest to Savings");
            System.out.println("8. Quit");
            System.out.print("Select option: ");

            int choice = input.nextInt();
            if (choice ==1){
                System.out.print("How much would you like to withdraw from Checking? $");
                double amount = input.nextDouble();
                newChecking.withdraw(amount);
                System.out.println("Current balance of Checking is $"+ newChecking.accountBalance);

            }
            else if (choice ==2){
                System.out.print("How much would you like to withdraw from Savings?");
                double amount = input.nextDouble();
                newSavings.withdraw(amount);
                System.out.println("Current balance of Savings is $" + newSavings.accountBalance);

            }
            else if (choice ==3){
                System.out.print("How much would you like to deposit to Checking? $");
                double amount = input.nextDouble();
                newChecking.deposit(amount);
                System.out.println("Current balance of Checking is $"+ newChecking.accountBalance);

            }
            else if (choice ==4){
                System.out.print("How much would you like to deposit to Savings? $");
                double amount = input.nextDouble();
                newSavings.deposit(amount);
                System.out.println("Current balance of Savings is $" + newSavings.accountBalance);

            }
            else if (choice ==5){
                System.out.print(newChecking.toString());


            }
            else if (choice ==6){
                System.out.print(newSavings.toString());
            }
            else if (choice ==7){
                newSavings.addInterest();
                System.out.println(newSavings.toString());

            }
            else if (choice ==8){
                 double interest = newSavings.accountBalance;
                System.out.print("Shutting off...");
                break;

            }
            else {
                System.out.println("Invalid choice");
            }
        }

    }
}