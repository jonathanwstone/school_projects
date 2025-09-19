public class Savings extends Account {

    // Variables
    int numberOfDeposits = 0;

    Savings(double accountBalance) {
        super(accountBalance);
    }

    // Override withdraw
    @Override
    public double withdraw(double amount) {
        accountBalance -= amount;
        if (accountBalance < 500) {
            System.out.println("Charging a fee of $10 because you are below $500");
            accountBalance -= 10;
        }
        return accountBalance;
    }

    //Override deposit
    @Override
    public double deposit(double amount) {
        accountBalance += amount;
        numberOfDeposits += 1;
        System.out.println("This is deposit " + numberOfDeposits + " to this account");

        if (numberOfDeposits > 5){
            System.out.println("Charging a fee of $10");
            accountBalance -= 10;
        }
        return accountBalance;
    }

    // Add interest to the account
    public double addInterest() {
        double amount = accountBalance * 0.15;
        System.out.println("Customer has earned $" + amount + " in interest");
        accountBalance += amount;
        return accountBalance;
    }

    // String toString Override
    @Override
    public String toString(){
        return "Savings Account #" + accountNumber + ", balance $" + accountBalance;
    }
}
