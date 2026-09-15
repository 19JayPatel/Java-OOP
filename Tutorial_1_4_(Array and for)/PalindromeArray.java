// Q3 - Check whether an array is a palindrome array or not.

import java.util.Scanner;

public class PalindromeArray {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] number = new int[n];

        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            number[i] = sc.nextInt();
        }

        boolean isPalindrome = true;

        for (int i = 0; i < n / 2; i++) {

            if (number[i] != number[n - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The array is a Palindrome Array.");
        } else {
            System.out.println("The array is Not a Palindrome Array.");
        }
    }
}
