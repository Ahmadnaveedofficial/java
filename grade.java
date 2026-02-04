// write a java program that
// take marks of 5 subject
// calculate total and percentage 
// display grade based in percentage 
import java.util.*;


public class grade {
    public static void main() {

        int a, b, c, d, e;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter the DSA marks: ");
        a = s.nextInt();

        System.out.print("Enter the Linear Algebra marks: ");
        b = s.nextInt();

        System.out.print("Enter the PF marks: ");
        c = s.nextInt();

        System.out.print("Enter the OOP marks: ");
        d = s.nextInt();

        System.out.print("Enter the DB marks: ");
        e = s.nextInt();

        int obtainedMarks = a + b + c + d + e;
        int totalMarks = 500;

        double percentage = (obtainedMarks * 100.0) / totalMarks;

        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Obtained Marks: " + obtainedMarks);
        System.out.println("Percentage: " + percentage + "%");

        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Your Grade is: " + grade);
    }
}
