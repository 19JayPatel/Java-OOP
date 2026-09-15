/* Q4 - Print a below pattern using nested loops.
        *
       ***
      *****
   1234567
      *****
       ***
        *
 */

import java.util.Scanner;

public class NumberStarPattern {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Rows: ");
        int n = sc.nextInt();

        int totalWidth = 2 * n + 1;

        // Upper half - stars, narrow to wide
        for (int i = 1; i <= n; i++) {

            int spaces = totalWidth - i;
            int stars = 2 * i - 1;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int s = 0; s < stars; s++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Middle row - numbers 1 to totalWidth
        for (int i = 1; i <= totalWidth; i++) {
            System.out.print(i);
        }

        System.out.println();

        // Lower half - stars, wide to narrow
        for (int i = n; i >= 1; i--) {

            int spaces = totalWidth - i;
            int stars = 2 * i - 1;

            for (int s = 0; s < spaces; s++) {
                System.out.print(" ");
            }

            for (int s = 0; s < stars; s++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
