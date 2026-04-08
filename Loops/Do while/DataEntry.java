import java.util.*;

public class DataEntry {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int marks;

        do {
            System.out.print("Enter marks (0-100): ");
            marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid input!");
            }

        } while (marks < 0 || marks > 100);

        System.out.println("Valid marks entered: " + marks);

        sc.close();
    }
}