
import java.util.Scanner;

public class Pattern5 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No : ");
        int a = sc.nextInt();
        for (int i = 0; i <= a; i++) // row wise
        {
            for (int j = 0; j <= a; j++) // column wise
            {
                System.out.print(i);
            }
            System.out.println("\n");
        }
    }
}
