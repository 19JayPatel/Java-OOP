
import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("Enter first number: ");
            int no1 = sc.nextInt();

            System.out.println("Enter second number: ");
            int no2 = sc.nextInt();

            int ans = no1 / no2;

            System.out.println("Result: " + ans);

        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        sc.close();
    }
}
