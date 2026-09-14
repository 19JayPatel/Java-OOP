
import java.util.Scanner;

public class EmployeeReport {

    public static void main(String[] args) {

        if (args.length < 1) {
            System.out.println("Please enter number of employees.");
            System.out.println("Example: java EmployeeReport 3");
            return;
        }

        int numberOfEmployees = Integer.parseInt(args[0]);

        String[] employeeNames = new String[numberOfEmployees];
        int[] employeeIds = new int[numberOfEmployees];
        double[] salaries = new double[numberOfEmployees];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numberOfEmployees; i++) {

            System.out.println();
            System.out.println("Enter details of Employee " + (i + 1));

            System.out.print("Enter employee name: ");
            employeeNames[i] = sc.nextLine();

            System.out.print("Enter employee ID: ");
            employeeIds[i] = sc.nextInt();

            System.out.print("Enter salary: ");
            salaries[i] = sc.nextDouble();

            sc.nextLine();
        }

        System.out.println();
        System.out.println("=================================================");
        System.out.println("              EMPLOYEE SALARY REPORT             ");
        System.out.println("=================================================");

        for (int i = 0; i < numberOfEmployees; i++) {

            double bonus = 0;
            double finalSalary;

            if (salaries[i] > 50000) {
                bonus = salaries[i] * 0.10;
            }

            finalSalary = salaries[i] + bonus;

            System.out.println();
            System.out.println("Employee Name : " + employeeNames[i]);
            System.out.println("Employee ID   : " + employeeIds[i]);
            System.out.println("Basic Salary  : Rs. " + salaries[i]);
            System.out.println("Bonus         : Rs. " + bonus);
            System.out.println("Final Salary  : Rs. " + finalSalary);
            System.out.println("-----------------------------------------------");
        }
    }
}
