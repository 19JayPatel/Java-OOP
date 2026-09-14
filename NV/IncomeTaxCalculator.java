
/*
 * Create an automated system that calculates income tax and mandatory
 * surcharges based on progressive slabs.
 * For Senior citizen:
 * up to 3 lacs tax is free 
 * 3 Lacs to 5 Lacs: 5% of income 
 * 5 Lacs to 10 Lacs: 15% of income 
 * 10 Lacs to 20 Lacs: 20% of income
 * 20% lacs flat of all income
 */
import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Annual Income: ");
        double income = sc.nextDouble();

        double tax = 0;

        if (income <= 300000) {
            tax = 0;
        } else if (income <= 500000) {
            // Tax only on amount above 3 lakh
            tax = (income - 300000) * 0.05;
        } else if (income <= 1000000) {
            // 5% on next 2 lakh + 15% on amount above 5 lakh
            tax = (200000 * 0.05)
                    + (income - 500000) * 0.15;
        } else if (income <= 2000000) {
            // 5% on next 2 lakh + 15% on next 5 lakh + 20% above 10 lakh
            tax = (200000 * 0.05)
                    + (500000 * 0.15)
                    + (income - 1000000) * 0.20;
        } else {
            // 5% on next 2 lakh + 15% on next 5 lakh + 20% on remaining
            tax = (200000 * 0.05)
                    + (500000 * 0.15)
                    + (1000000 * 0.20)
                    + (income - 2000000) * 0.20;
        }

        // Mandatory surcharge (10% of tax)
        double surcharge = tax * 0.10;

        double totalTax = tax + surcharge;

        System.out.println("\n------ Tax Details ------");
        System.out.println("Annual Income : ₹" + income);
        System.out.println("Income Tax    : ₹" + tax);
        System.out.println("Surcharge     : ₹" + surcharge);
        System.out.println("Total Tax     : ₹" + totalTax);

        sc.close();
    }
}