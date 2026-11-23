public class Q1 {

    public static void main(String args[]) {

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum = sum + (2 * i - 1);
        }

        IO.println("Sum of first 10 odd numbers: " + sum);
    }
}
