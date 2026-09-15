// Q2 - Calculate the factorial of a number using recursion and loop (compare both).

import java.util.Scanner;

public class FactorialCompare {

    // Factorial using recursion
    static long factorialRecursion(int n) {

        if (n == 0 || n == 1) {
            return 1;
        }

        return n * factorialRecursion(n - 1);
    }

    // Factorial using loop
    static long factorialLoop(int n) {

        long fact = 1;

        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        long recursionResult = factorialRecursion(n);
        long loopResult = factorialLoop(n);

        System.out.println("\nFactorial using Recursion: " + recursionResult);
        System.out.println("Factorial using Loop      : " + loopResult);

        if (recursionResult == loopResult) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results do not match.");
        }
    }
}
