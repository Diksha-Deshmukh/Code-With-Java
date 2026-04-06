import java.util.*;

public class ControlStatementsDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = sc.nextInt();

        // if statement
        if (marks >= 0) {
            System.out.println("Marks entered successfully.");
        }

        // if-else statement
        if (marks >= 40) {
            System.out.println("You passed.");
        } else {
            System.out.println("You failed.");
        }

        // else-if ladder
        if (marks >= 90) {
            System.out.println("Grade: A+");
        } else if (marks >= 75) {
            System.out.println("Grade: A");
        } else if (marks >= 60) {
            System.out.println("Grade: B");
        } else if (marks >= 50) {
            System.out.println("Grade: C");
        } else if (marks >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }

        sc.close();
    }
}
