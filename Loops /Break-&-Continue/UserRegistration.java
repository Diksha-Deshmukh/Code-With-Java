import java.util.*;

public class UserRegistration {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter username: ");
            String username = sc.next();

            if (username.length() < 5) {
                System.out.println("Username too short!");
                continue;
            }

            System.out.print("Enter password: ");
            String password = sc.next();

            if (password.length() < 6) {
                System.out.println("Weak password!");
                continue;
            }

            System.out.println("Registration Successful ✅");
            break;
        }

        sc.close();
    }
}
