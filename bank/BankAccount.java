package bank;

public class BankAccount {

    private String accountHolderName;
    private double balance;

    // Constructor
    public BankAccount(String name, double initialBalance) {
        accountHolderName = name;
        balance = initialBalance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(amount + " deposited");
        } else {
            System.out.println("Invalid deposit");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient balance");
        } else {
            balance -= amount;
            System.out.println(amount + " withdrawn");
        }
    }

    public double getBalance() {
        return balance;
    }
}
