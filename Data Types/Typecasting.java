import java.util.*;

public class ShoppingCart {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        double total = 0;

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter price of item " + i + ": ");
            double price = sc.nextDouble();

            System.out.print("Enter quantity: ");
            int qty = sc.nextInt();

            total += price * qty; // implicit casting
        }

        System.out.print("Enter discount %: ");
        double discount = sc.nextDouble();

        double discountAmount = total * discount / 100;
        double finalAmount = total - discountAmount;

        // GST calculation (float + casting)
        float gstRate = 18.0f;
        float gst = (float)(finalAmount * gstRate / 100);

        double grandTotal = finalAmount + gst;

        // rounding using casting
        int roundedBill = (int) grandTotal;

        System.out.println("\n--- BILL ---");
        System.out.println("Total: " + total);
        System.out.println("Discount: " + discountAmount);
        System.out.println("GST: " + gst);
        System.out.println("Grand Total: " + grandTotal);
        System.out.println("Rounded Bill: " + roundedBill);

        sc.close();
    }
}