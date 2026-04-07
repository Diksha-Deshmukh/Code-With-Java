import java.util.*;

public class NestedSwitchDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1. Food");
        System.out.println("2. Drinks");
        System.out.print("Select category: ");

        int category = sc.nextInt();

        switch (category) {

            case 1:
                System.out.println("1. Pizza");
                System.out.println("2. Burger");
                System.out.print("Choose food: ");
                int food = sc.nextInt();

                switch (food) {
                    case 1:
                        System.out.println("You selected Pizza 🍕");
                        break;
                    case 2:
                        System.out.println("You selected Burger 🍔");
                        break;
                    default:
                        System.out.println("Invalid food choice");
                }
                break;

            case 2:
                System.out.println("1. Coffee");
                System.out.println("2. Juice");
                System.out.print("Choose drink: ");
                int drink = sc.nextInt();

                switch (drink) {
                    case 1:
                        System.out.println("You selected Coffee ☕");
                        break;
                    case 2:
                        System.out.println("You selected Juice 🧃");
                        break;
                    default:
                        System.out.println("Invalid drink choice");
                }
                break;

            default:
                System.out.println("Invalid category");
        }

        sc.close();
    }
}
