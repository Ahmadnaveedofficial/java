// take current balance and withdrawal amount check if withdrwal amount is less
//  than balance -> allow withdraw other wise->  show " insufficient balance"

public static void main() {
    int bal, withdrawal;
    Scanner s = new Scanner(System.in);
    System.out.println("Enter current balance: ");
    bal = s.nextInt();
    System.out.println("Enter withdrawal amount: ");
    withdrawal = s.nextInt();
    
    if (withdrawal <= bal) {
        bal = bal - withdrawal;
        System.out.println("Withdrawal successful. New balance: " + bal);
    } else {
        System.out.println("Insufficient balance");
    }
}

