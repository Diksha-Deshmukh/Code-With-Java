import java.util.*;

class Employee {
    String name;
    String department;

    int id;
    double salary;
    boolean isActive;
    char grade;

    Employee(int id, String name, String department, double salary, boolean isActive, char grade) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
        this.isActive = isActive;
        this.grade = grade;
    }

    void displayDetails() {
        System.out.println("\n--- Employee Details ---");
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
        System.out.println("Active: " + isActive);
        System.out.println("Grade: " + grade);
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));

            System.out.print("ID: ");
            int id = sc.nextInt();

            sc.nextLine(); // clear buffer

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Department: ");
            String dept = sc.nextLine();

            System.out.print("Salary: ");
            double salary = sc.nextDouble();

            System.out.print("Is Active (true/false): ");
            boolean isActive = sc.nextBoolean();

            System.out.print("Grade (A/B/C): ");
            char grade = sc.next().charAt(0);

            employees.add(new Employee(id, name, dept, salary, isActive, grade));
        }

        // Display all employees
        double totalSalary = 0;

        for (Employee emp : employees) {
            emp.displayDetails();
            totalSalary += emp.salary;
        }

        double avgSalary = totalSalary / employees.size();

        System.out.println("\nTotal Employees: " + employees.size());
        System.out.println("Average Salary: " + avgSalary);

        sc.close();
    }
}