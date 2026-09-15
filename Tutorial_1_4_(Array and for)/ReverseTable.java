// Q1 - Print the reverse multiplication table of a given number (from 10 to 1).

import java.util.Scanner;

public class ReverseTable {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        System.out.println("\nReverse Multiplication Table of " + n + ":");

        for (int i = 10; i >= 1; i--) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
    }
}
