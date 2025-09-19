public class Checking extends Account {

    // Constructor
    public Checking(double accountBalance){
        super(accountBalance);
    }

    // Withdraw Override
    @Override
    public double withdraw(double amount){
        accountBalance -= amount;

        if (accountBalance < 0){
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            accountBalance -= 20;
        }
        return accountBalance;
    }

    // Overrides String toString to properly print
    @Override
    public String toString() {
        return "Checking account #" + accountNumber + ", balance $" + accountBalance;
    }
}
