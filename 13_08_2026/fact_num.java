
// Factorial (3->3*2*1)
import java.util.*;

class factorial {
    factorial(int a) {
        int ans = 1;
        for (int i = 1; i <= a; i++) {
            ans = ans * i;

        }
        System.out.println("Factorial = " + ans);
    }

}

public class fact_num {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Factorial Number : ");
        int a = sc.nextInt();
        factorial fact = new factorial(a);
    }
}
