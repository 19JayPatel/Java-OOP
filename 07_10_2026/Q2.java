
import java.util.Scanner;

class Student {

    Scanner sc = new Scanner(System.in);
    int arr[] = new int[5];

    void input() {
        try {
            System.out.println("Enter 5 elements:");

            for (int i = 0; i < 5; i++) {
                arr[i] = sc.nextInt();
            }

        } catch (Exception e) {
            System.out.println("Input Error: " + e);
        }
    }

    void show() {
        try {
            System.out.println("Element: " + arr[5]);

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

public class Q2 {

    public static void main(String[] args) {

        Student s = new Student();

        s.input();
        s.show();
    }
}
