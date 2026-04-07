import java.util.*;

public class ShoppingSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        System.out.print("Are you a premium member? (true/false): ");
        boolean isPremium = sc.nextBoolean();

        // Arithmetic Operators
        double total = price * quantity;

        // Relational Operators
        boolean isBulkOrder = quantity >= 5;

        // Logical Operators
        boolean applyDiscount = isPremium && isBulkOrder;

        // Ternary Operator
        double discountPercent = applyDiscount ? 20 : 10;

        double discount = total * discountPercent / 100;

        double finalAmount = total - discount;

        // Assignment Operators
        finalAmount += (finalAmount * 0.18); // add GST

        // Unary Operators
        int itemsProcessed = 0;
        itemsProcessed++; // increment

        // Additional Check (Relational + Logical)
        if (finalAmount > 5000 || quantity > 10) {
            System.out.println("You qualify for free delivery 🚚");
        }

        // Output
        System.out.println("\n--- BILL DETAILS ---");
        System.out.println("Total Amount: " + total);
        System.out.println("Discount Applied: " + discount);
        System.out.println("Final Amount (with GST): " + finalAmount);
        System.out.println("Items Processed: " + itemsProcessed);

        sc.close();
    }
}
