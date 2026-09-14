
import java.util.Scanner;

public class LoanEligibility {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int age;
        double annualIncome;
        short creditScore;
        byte existingLoanCount;

        // Validate age
        System.out.print("Enter age: ");

        if (scanner.hasNextInt()) {
            age = scanner.nextInt();
        } else {
            System.out.println("Invalid age. Please enter a whole number.");
            scanner.close();
            return;
        }

        // Validate income
        System.out.print("Enter annual income: ");

        if (scanner.hasNextDouble()) {
            annualIncome = scanner.nextDouble();
        } else {
            System.out.println("Invalid income. Please enter a number.");
            scanner.close();
            return;
        }

        // Validate credit score
        System.out.print("Enter credit score: ");

        if (scanner.hasNextShort()) {
            creditScore = scanner.nextShort();
        } else {
            System.out.println("Invalid credit score.");
            scanner.close();
            return;
        }

        // Validate existing loan count
        System.out.print("Enter existing loan count: ");

        if (scanner.hasNextByte()) {
            existingLoanCount = scanner.nextByte();
        } else {
            System.out.println("Invalid loan count.");
            scanner.close();
            return;
        }

        // Example eligibility conditions
        boolean isEligible
                = age >= 21
                && annualIncome >= 300000
                && creditScore >= 650
                && existingLoanCount <= 2;

        System.out.println("\n--- Loan Eligibility ---");

        if (isEligible) {
            System.out.println("Result: Eligible for loan");
        } else {
            System.out.println("Result: Not eligible for loan");
        }

        scanner.close();
    }
}
