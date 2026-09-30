
import java.util.Scanner;

class Bank {

    double amount;
    double rate = 5.7;
    double grand_total;

    Bank(double a) {
        amount = a;
    }

    void calculate() {
        double roi;

        roi = (amount * rate * 5) / 100;

        grand_total = amount + roi;

        System.out.println("\n----- Bank Details -----");
        System.out.println("Current Balance: " + amount);
        System.out.println("Rate of Interest for 5 Years: " + rate + "%");
        System.out.println("ROI: " + roi);
        System.out.println("Grand Total = " + grand_total);
    }
}

public class BankDemo {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Current Balance: ");
        double amount = sc.nextDouble();

        Bank b1 = new Bank(amount);

        b1.calculate();

        sc.close();
    }
}
