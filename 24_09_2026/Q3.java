
import java.util.Scanner;

public class Q3 {

    static int square(int n) {
        return n * n;
    }

    static int cube(int n) {
        return n * n * n;
    }

    static void display(int n) {
        System.out.println("Number: " + n);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        display(num);

        System.out.println("Square: " + square(num));

        System.out.println("Cube: " + cube(num));

        sc.close();
    }
}
