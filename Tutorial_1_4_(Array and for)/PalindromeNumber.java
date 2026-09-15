// Q3 - Check whether a given number is palindrome using a loop.

import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int original = n;
        int reverse = 0;

        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        System.out.println("Reverse: " + reverse);

        if (original == reverse) {
            System.out.println(original + " is a Palindrome Number.");
        } else {
            System.out.println(original + " is Not a Palindrome Number.");
        }
    }
}
