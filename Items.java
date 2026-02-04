// write a program in java program should 
// take  price  of multiple items in array
//calculate total 
// apply 5% tax 
//display final paylable amount

import java.util.Scanner;
public class Items{
  static  void main(){
        int n;
    Scanner s= new Scanner(System.in);
    System.out.print("Enter the number that create a array of items");
    n=s.nextInt();
    double total=0;

     double [] prices = new double [n];
     for(int i=0;i<n;i++){
        System.out.print("enter the price of item"+(i+1));
        prices[i]=s.nextDouble();
        total =total+prices[i];
     }
        double tax= total * 0.05;
        double finalTotal=total+tax;
        System.out.println("Total Amount :"+total);
        System.out.println("Tax :"+tax);
        System.out.println("paid Amount :"+finalTotal);
    }
}