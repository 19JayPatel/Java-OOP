// Q1 - Store 10 integers in an array and print only the prime numbers from it.

import java.util.Scanner;

public class PrimeInArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] number = new int[10];

        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            number[i] = sc.nextInt();
        }

        System.out.println("\nPrime numbers from the array:");

        for (int i = 0; i < 10; i++) {

            int count = 0;

            for (int j = 1; j <= number[i]; j++) {
                if (number[i] % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.print(number[i] + "\t");
            }
        }

        System.out.println();
    }
}
