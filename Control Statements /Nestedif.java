import java.util.*;

public class LoanApproval {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your salary: ");
        double salary = sc.nextDouble();

        System.out.print("Enter your credit score: ");
        int creditScore = sc.nextInt();

        if (salary >= 30000) {
            if (creditScore >= 700) {
                System.out.println("Loan Approved ✅");
            } else {
                System.out.println("Loan Rejected ❌ (Low Credit Score)");
            }
        } else {
            System.out.println("Loan Rejected ❌ (Low Salary)");
        }

        sc.close();
    }
}
