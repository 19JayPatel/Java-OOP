/* Print 1 to 5 using forloop */

import java.util.Scanner;

public class for_loop {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Limit:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}