import java.util.*;

public class BreakExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter number (negative to stop): ");
            int num = sc.nextInt();

            if (num < 0) {
                System.out.println("Stopping input...");
                break;
            }

            System.out.println("You entered: " + num);
        }

        sc.close();
    }
}
