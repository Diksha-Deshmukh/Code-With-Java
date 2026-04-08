import java.util.*;

public class CompoundInterest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter principal: ");
        double principal = sc.nextDouble();

        System.out.print("Enter rate (%): ");
        double rate = sc.nextDouble();

        System.out.print("Enter years: ");
        int years = sc.nextInt();

        for (int i = 1; i <= years; i++) {
            principal = principal + (principal * rate / 100);
            System.out.println("Year " + i + ": " + principal);
        }

        sc.close();
    }
}
