import java.util.*;

public class PasswordChecker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password = "admin123";
        String input = "";

        while (!input.equals(password)) {
            System.out.print("Enter password: ");
            input = sc.nextLine();

            if (!input.equals(password)) {
                System.out.println("Wrong password! Try again.");
            }
        }

        System.out.println("Access Granted ✅");

        sc.close();
    }
}