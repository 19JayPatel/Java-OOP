import java.util.Scanner;

public class EmployeePayroll {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Taking employee details
        System.out.print("Enter employee ID: ");
        int employeeId = scanner.nextInt();

        // Clear the leftover newline before using nextLine()
        scanner.nextLine();

        System.out.print("Enter employee full name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter basic salary: ");
        double basicSalary = scanner.nextDouble();

        System.out.print("Enter gender (M/F): ");
        char gender = scanner.next().charAt(0);

        System.out.print("Is employee tax exempt? (true/false): ");
        boolean isTaxExempt = scanner.nextBoolean();

        // For this question, gross salary is the basic salary
        double grossSalary = basicSalary;

        // Calculate tax
        double tax = 0;

        if (!isTaxExempt) {
            tax = grossSalary * 0.12;
        }

        // Calculate net salary
        double netSalary = grossSalary - tax;

        // Display employee payroll
        System.out.println("\n--- Employee Payroll ---");
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + employeeName);
        System.out.println("Gender: " + gender);
        System.out.printf("Gross Salary: %.2f%n", grossSalary);
        System.out.printf("Tax: %.2f%n", tax);
        System.out.printf("Net Salary: %.2f%n", netSalary);

        scanner.close();
    }
}