import java.util.*;

public class MenuSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.print("Choose option: ");

        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Your balance is ₹5000");
                break;
            case 2:
                System.out.println("Deposit successful!");
                break;
            case 3:
                System.out.println("Withdrawal successful!");
                break;
            default:
                System.out.println("Invalid option!");
        }

        sc.close();
    }
}
