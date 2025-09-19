public class Account {

    // Variables
    int accountNumber;
    static int nextNumber;
    double accountBalance;

    // Account Constructor
    public Account() {
        accountNumber = nextNumber;
        nextNumber++;
    }

    // Account Constructor
    public Account(double accountBalance) {
        this.accountBalance = 0;
    }

    // Withdraw tool
    public double withdraw(double amount){
        accountBalance -= amount;
        return accountBalance;
    }

    // Deposit tool
    public double deposit(double amount){
        accountBalance += amount;
        return accountBalance;
    }

    // Getter for accountBalance
    public double getAccountBalance(){
        return accountBalance;
    }

    // toString to print out Account info
    public String toString(){
        return "Account #" + accountNumber + ", balance " + accountBalance;
    }
}
