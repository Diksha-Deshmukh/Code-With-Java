import java.util.*;

public class ShoppingDiscount {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total amount: ");
        double amount = sc.nextDouble();

        System.out.print("Are you a premium member? (true/false): ");
        boolean isPremium = sc.nextBoolean();

        if (amount > 1000) {
            if (isPremium) {
                System.out.println("You get 20% discount!");
            } else {
                System.out.println("You get 10% discount!");
            }
        } else {
            System.out.println("No discount available.");
        }

        sc.close();
    }
}
