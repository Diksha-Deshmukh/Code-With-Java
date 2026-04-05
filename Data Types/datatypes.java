import java.util.Scanner;

class DataTypesAdvanced {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        System.out.print("Enter your height (in meters): ");
        float height = sc.nextFloat();

        System.out.print("Enter your grade (A/B/C): ");
        char grade = sc.next().charAt(0);

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = sc.nextBoolean();

        // Type casting
        double heightInCm = height * 100; // float → double automatically

        // Logic using conditions
        System.out.println("\n--- User Details ---");
        System.out.println("Age: " + age);
        System.out.println("Height in cm: " + heightInCm);
        System.out.println("Grade: " + grade);
        System.out.println("Student: " + isStudent);

        // Conditional logic
        if (age >= 18 && isStudent) {
            System.out.println("You are an adult student.");
        } else if (age >= 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a minor.");
        }

        // Grade evaluation
        switch (grade) {
            case 'A':
                System.out.println("Excellent performance!");
                break;
            case 'B':
                System.out.println("Good job!");
                break;
            case 'C':
                System.out.println("Needs improvement.");
                break;
            default:
                System.out.println("Invalid grade.");
        }

        sc.close();
    }
}