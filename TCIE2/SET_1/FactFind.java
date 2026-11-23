
import java.util.Scanner;

public class FactFind {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int no;
        long fact = 1;

        IO.println("Enter number:");
        no = sc.nextInt();

        for (int i = 1; i <= no; i++) {
            fact = fact * i;
        }

        IO.println("Factorial is: " + fact);

        sc.close();
    }
}
