class BankAccount {
    public String accountHolder;      // Public attribute
    private double balance;           // Private attribute
    protected String accountType;     // Protected attribute

    // Constructor
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Deposit method
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }

    // Getter method for balance
    public double getBalance() {
        return balance;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        // Create BankAccount object
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");

        // Perform deposit and withdraw operations
        myAccount.deposit(250.0);
        myAccount.withdraw(100.0);

        // Print account details
        System.out.println("Account Holder: " + myAccount.accountHolder);
        System.out.println("Account Type: " + myAccount.accountType);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
