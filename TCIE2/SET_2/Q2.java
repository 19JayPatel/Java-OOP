import java.util.Scanner;

class Multiply {

    int a, b;

    void input() {
        Scanner sc = new Scanner(System.in);

        IO.println("Enter first value:");
        a = sc.nextInt();

        IO.println("Enter second value:");
        b = sc.nextInt();
    }

    void show() {
        int ans = a * b;

        IO.println("Multiplication = " + ans);
    }
}

public class Q2 {

    public static void main(String args[]) {

        Multiply m1 = new Multiply();

        m1.input();
        m1.show();
    }
}
