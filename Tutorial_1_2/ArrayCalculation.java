import java.util.Scanner;

public class ArrayCalculation {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] numbers = new int[n];

        System.out.println("Enter " + n + " numbers:");

        for (int i = 0; i < n; i++) {
            numbers[i] = sc.nextInt();
        }

        int maximum = numbers[0];
        int minimum = numbers[0];
        int sum = 0;

        for (int i = 0; i < n; i++) {

            if (numbers[i] > maximum) {
                maximum = numbers[i];
            }

            if (numbers[i] < minimum) {
                minimum = numbers[i];
            }

            sum = sum + numbers[i];
        }

        System.out.println("Maximum: " + maximum);
        System.out.println("Minimum: " + minimum);
        System.out.println("Sum: " + sum);
    }
}
