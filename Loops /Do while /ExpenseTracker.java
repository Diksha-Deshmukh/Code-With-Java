import java.util.*;

public class ExpenseTracker {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double totalExpense = 0;
        String choice;

        do {
            System.out.print("Enter expense amount: ");
            double expense = sc.nextDouble();

            totalExpense += expense;

            System.out.print("Add more expenses? (yes/no): ");
            choice = sc.next();

        } while (choice.equalsIgnoreCase("yes"));

        System.out.println("Total Expense: ₹" + totalExpense);

        sc.close();
    }
}
