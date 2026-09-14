
import java.util.Scanner;

/**
 * Different loops, rows & columns.
 */

class Pattern1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) // row wise
        {
            for (int j = 0; j <= i; j++) // column wise
            {
                System.out.print(j);
            }
            System.out.println("\n");
        }
    }

}