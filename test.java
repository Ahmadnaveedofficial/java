import java.util.Scanner;

// public class test {
// static void main() {
//     System.out.println("hello world");
//     Scanner sc = new Scanner(System.in);
//     System.err.print("Enter something: ");
//     String input = sc.nextLine();
//     System.out.println("You entered: " + input);
// }
// }

// public class test {
//     static void main(){
//         int x,y;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter first number: ");
//         x=sc.nextInt();
//         System.out.print("Enter second number: ");
//         y=sc.nextInt();
//         if(x>=0){
//             System.out.println(x+" is positive");
//         }
//         else if(y>=0){
//             System.out.println(y+" is positive");
//         }
//     }
// }

public class test {

     static void main(){
        int x;
        int count =0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a limit that you can print the odd numbers : ");
        x=sc.nextInt();
        for(int i=1;i<=x;i++){
            if(i%2!=0){
                System.out.println(i);
                count++;
            }

        }
        System.out.println("Total odd numbers are with in  " + x + " are " + count);
     }
}