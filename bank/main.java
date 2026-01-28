package bank;

public class main {

    public static void main() {

        BankAccount account = new BankAccount("Ahmad", 5000);

        account.deposit(2000);
        account.withdraw(3000);

        System.out.println("Final Balance: " + account.getBalance());
    }
}
