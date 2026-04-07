import java.util.*;

public class StudentResult {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        if (marks >= 40) {
            if (marks >= 90) {
                System.out.println("Grade: A+");
            } else if (marks >= 75) {
                System.out.println("Grade: A");
            } else {
                System.out.println("Grade: B");
            }
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
