// Interface for Bank Account
interface BankAccount {
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    void displayAccountInfo();
}

// Implementation for Savings Account
class SavingsAccount implements BankAccount {
    private double balance;
    private double interestRate;

    public SavingsAccount(double initialBalance, double interestRate) {
        this.balance = initialBalance;
        this.interestRate = interestRate;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " into Savings Account.");
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Savings Account.");
        } else {
            System.out.println("Insufficient balance in Savings Account.");
        }
    }

    public double getBalance() {
        double interest = balance * (interestRate / 100);
        return balance + interest;
    }

    public void displayAccountInfo() {
        System.out.println("\nSavings Account Info:");
        System.out.println("Balance: ₹" + balance);
        System.out.println("Interest Rate: " + interestRate + "%");
        System.out.println("Balance with Interest: ₹" + getBalance());
    }
}

// Implementation for Current Account
class CurrentAccount implements BankAccount {
    private double balance;
    private double overdraftLimit;

    public CurrentAccount(double initialBalance, double overdraftLimit) {
        this.balance = initialBalance;
        this.overdraftLimit = overdraftLimit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " into Current Account.");
    }

    public void withdraw(double amount) {
        if ((balance - amount) >= -overdraftLimit) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " from Current Account.");
        } else {
            System.out.println("Withdrawal exceeds overdraft limit in Current Account.");
        }
    }

    public double getBalance() {
        return balance;
    }

    public void displayAccountInfo() {
        System.out.println("\nCurrent Account Info:");
        System.out.println("Balance: ₹" + balance);
        System.out.println("Overdraft Limit: ₹" + overdraftLimit);
    }
}

// Main class
public class BankSystem {
    public static void main(String[] args) {
        // Create Savings Account
        SavingsAccount sa = new SavingsAccount(5000, 5); // ₹5000 with 5% interest
        sa.deposit(2000);
        sa.withdraw(1000);
        sa.displayAccountInfo();

        // Create Current Account
        CurrentAccount ca = new CurrentAccount(3000, 2000); // ₹3000 balance, ₹2000 overdraft
        ca.deposit(1000);
        ca.withdraw(4500); // Should be allowed (within overdraft)
        ca.withdraw(1000); // Should be rejected (beyond overdraft)
        ca.displayAccountInfo();
    }
}
