import java.util.*;

public class ContinueExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 5; i++) {
            System.out.print("Enter marks: ");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Skipping...");
                continue;
            }

            System.out.println("Valid marks: " + marks);
        }

        sc.close();
    }
}
