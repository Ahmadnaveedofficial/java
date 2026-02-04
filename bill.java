
public class bill {


public static void main(String[] args) {
    java.util.Scanner sc = new java.util.Scanner(System.in);
    
    double totalBill=0 ;
    
    for (int i = 1; i <=3; i++) {
        System.out.print("Enter quantity for item " + i + ": ");
        int quantity = sc.nextInt();
        
        System.out.print("Enter price for item " + i + ": ");
        double price = sc.nextDouble();
        
        totalBill += quantity * price;
    }
    
    double discount = 0;
    if (totalBill > 2000) {
        discount = totalBill * 0.10;
        totalBill -= discount;
    }
    
    System.out.println("\nTotal Bill: " + totalBill);
    if (discount > 0) {
        System.out.println("Discount 10%: " + discount);
    }
    
}
}