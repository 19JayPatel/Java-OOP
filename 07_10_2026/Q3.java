
import java.util.Scanner;

class Student {

    Scanner sc = new Scanner(System.in);
    int no1, no2;
    int ans;

    void input() {
        try {
            System.out.println("Enter first number: ");
            no1 = sc.nextInt();

            System.out.println("Enter second number: ");
            no2 = sc.nextInt();

        } catch (Exception e) {
            System.out.println("Input Error: " + e);
        }
    }

    void show() {
        try {
            try {
                ans = no1 / no2;
                System.out.println("Result: " + ans);

            } catch (ArithmeticException e) {
                System.out.println("Calculation Error: " + e);
            }

            try {
                int arr[] = new int[5];
                System.out.println("Enter array element: ");
                int index = sc.nextInt();

                arr[index] = 10;
                System.out.println("Array Element: " + arr[index]);

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Error: " + e);
            }

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

public class Q3 {

    public static void main(String[] args) {

        Student s = new Student();

        s.input();
        s.show();
    }
}
