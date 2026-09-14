import java.util.Scanner;

public class DemoCal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter two Numbers: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int ans;

        System.out.println("For basic arithmetic operation");
        System.out.println("Select  + for Addition");
        System.out.println("Select  - for Subtraction");
        System.out.println("Select  * for Multiplication");
        System.out.println("Select  / for Division");
        System.out.println("Select  % for Modulus");

        System.out.print("Enter your choice: ");
        char choice = sc.next().charAt(0);

        switch (choice) {
            case '+':
                ans = num1 + num2;
                System.out.println("Addition is: " + ans);
                break;
            case '-':
                ans = num1 - num2;
                System.out.println("Subtraction is: " + ans);
                break;
            case '*':
                ans = num1 * num2;
                System.out.println("Multiplication is: " + ans);
                break;
            case '/':
                ans = num1 / num2;
                System.out.println("Division is: " + ans);
                break;
            case '%':
                ans = num1 % num2;
                System.out.println("Modulus is: " + ans);
                break;
            default:
                System.out.println("Invalid choice! Please select a valid operation.");
        }
        sc.close();
    }
}
