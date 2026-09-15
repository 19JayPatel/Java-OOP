
import java.util.Scanner;

class Loan {

    int customer_id;
    String customer_name;
    double loan_amount;
    double interest_rate;

    Loan(int id, String name, double amount, double rate) {
        customer_id = id;
        customer_name = name;
        loan_amount = amount;
        interest_rate = rate;
    }

    void display() {
        System.out.println("Customer ID: " + customer_id);
        System.out.println("Customer Name: " + customer_name);
        System.out.println("Loan Amount: " + loan_amount);
        System.out.println("Interest Rate: " + interest_rate + "%");
    }
}

public class LoanEMICalculator {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        if (args.length == 0) {
            System.out.println("Please pass Customer ID through command-line argument.");
            return;
        }

        int id = Integer.parseInt(args[0]);

        Loan l1 = new Loan(id, "Jay", 100000, 10);

        l1.display();

        System.out.print("\nEnter loan tenure in months: ");
        int months = sc.nextInt();

        double monthly_rate = l1.interest_rate / (12 * 100);

        double emi = (l1.loan_amount * monthly_rate
                * Math.pow(1 + monthly_rate, months))
                / (Math.pow(1 + monthly_rate, months) - 1);

        double total_repayment = emi * months;

        System.out.println("\n----- Loan Details -----");
        System.out.println("Customer ID: " + l1.customer_id);
        System.out.println("Customer Name: " + l1.customer_name);
        System.out.println("Loan Amount: " + l1.loan_amount);
        System.out.println("Interest Rate: " + l1.interest_rate + "%");
        System.out.println("Loan Tenure: " + months + " months");
        System.out.println("Monthly EMI: " + emi);
        System.out.println("Total Repayment Amount: " + total_repayment);

        sc.close();
    }
}
