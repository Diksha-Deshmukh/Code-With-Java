import java.util.*;

public class WhileSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int i = 1, sum = 0;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("Sum = " + sum);

        sc.close();
    }
}