import java.util.*;

public class VehicleRental {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Bike - ₹500/day");
        System.out.println("2. Car - ₹2000/day");
        System.out.println("3. Bus - ₹5000/day");
        System.out.print("Select vehicle: ");

        int choice = sc.nextInt();

        System.out.print("Enter number of days: ");
        int days = sc.nextInt();

        int cost = 0;

        switch (choice) {
            case 1:
                cost = 500 * days;
                break;
            case 2:
                cost = 2000 * days;
                break;
            case 3:
                cost = 5000 * days;
                break;
            default:
                System.out.println("Invalid vehicle!");
                return;
        }

        System.out.println("Total Rent: ₹" + cost);

        sc.close();
    }
}
